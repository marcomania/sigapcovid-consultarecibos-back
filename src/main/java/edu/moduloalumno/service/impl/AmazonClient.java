
package edu.moduloalumno.service.impl;

/**
 *
 * @author JUNIOR
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.annotation.PostConstruct;
import java.io.ByteArrayOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;


import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;
import java.io.InputStream;
//import com.amazonaws.services.s3.model.S3Object;

@Service
public class AmazonClient {

	private AmazonS3 s3client;

	@Value("${amazonProperties.endpointUrl}")
	private String endpointUrl;
	@Value("${amazonProperties.bucketName}")
	private String bucketName;
	@Value("${amazonProperties.accessKey}")
	private String accessKey;
	@Value("${amazonProperties.secretKey}")
	private String secretKey;

	private Logger logger = LoggerFactory.getLogger(AmazonClient.class);
	
	@PostConstruct
	private void initializeAmazon() {
		AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
		this.s3client = new AmazonS3Client(credentials);
	}

	public String uploadFile(String id,MultipartFile multipartFile) throws IOException {

		String fileUrl = "";
		try {
			File file = convertMultiPartToFile(multipartFile);
			//String fileName = getFileExtension(id,multipartFile);
			fileUrl = endpointUrl + "/" + bucketName + "/" + id;
			uploadFileTos3bucket(id, file);
			file.delete();
		} /*catch (Exception e) {
			e.printStackTrace();
		}*/
		catch (AmazonServiceException ase) {
	          logger.info("Caught an AmazonServiceException from GET requests, rejected reasons:");
	          logger.info("Error Message:    " + ase.getMessage());
	          logger.info("HTTP Status Code: " + ase.getStatusCode());
	          logger.info("AWS Error Code:   " + ase.getErrorCode());
	          logger.info("Error Type:       " + ase.getErrorType());
	          logger.info("Request ID:       " + ase.getRequestId());
	          
	          
	            } catch (AmazonClientException ace) {
	              logger.info("Caught an AmazonClientException: ");
	                logger.info("Error Message: " + ace.getMessage());
	            } catch (IOException ioe) {
	              logger.info("IOE Error Message: " + ioe.getMessage());
	              
	            }
		return fileUrl;

	}

	public String deleteFileFromS3Bucket(String fileUrl) {
		String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
		s3client.deleteObject(new DeleteObjectRequest(bucketName + "/", fileName));
		return "Successfully deleted";
	}
        
        public ByteArrayOutputStream getFile(String keyName) {
            
                //String key=stripExtension()
                /*String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
                
                S3Object obj = s3client.getObject(new GetObjectRequest(bucketName+"/",fileName));
                S3ObjectInputStream stream = obj.getObjectContent();
                    try {
                        byte[] content = IOUtils.toByteArray(stream);
                        obj.close();
                        return content;
                    } catch (IOException e) {
                        System.out.println(fileName);
                        e.printStackTrace();
                    }
                   //System.out.println(obj);
            return null;*/
                try {
                            S3Object s3object = s3client.getObject(new GetObjectRequest(bucketName, keyName));

                            InputStream is = s3object.getObjectContent();
                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                            int len;
                            byte[] buffer = new byte[4096];
                            while ((len = is.read(buffer, 0, buffer.length)) != -1) {
                                baos.write(buffer, 0, len);
                                }
            
                        return baos;
                        } catch (IOException ioe) {
                          logger.error("IOException: " + ioe.getMessage());
                            } catch (AmazonServiceException ase) {
                                    logger.info("sCaught an AmazonServiceException from GET requests, rejected reasons:");
                                    logger.info("Error Message:    " + ase.getMessage());
                                    logger.info("HTTP Status Code: " + ase.getStatusCode());
                                    logger.info("AWS Error Code:   " + ase.getErrorCode());
                                    logger.info("Error Type:       " + ase.getErrorType());
                                    logger.info("Request ID:       " + ase.getRequestId());
                                    throw ase;
                            } catch (AmazonClientException ace) {
                                logger.info("Caught an AmazonClientException: ");
                                logger.info("Error Message: " + ace.getMessage());
                                throw ace;
                            }

                        return null;
  
    }
	private void uploadFileTos3bucket(String fileName, File file) {
		s3client.putObject(
				new PutObjectRequest(bucketName, fileName, file));
				//.withCannedAcl(CannedAccessControlList.PublicRead));
	}

	private String generateFileName(MultipartFile multiPart) {
                
		return new Date().getTime() + "-" + multiPart.getOriginalFilename().replace(" ", "_");
	}
        
         private static String getFileExtension(String id,MultipartFile multipart) {
            String fileName = multipart.getOriginalFilename();
            if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return id+fileName.substring(fileName.lastIndexOf("."));
            else return id;
        }
         
        static String stripExtension (String str) {
            // Handle null case specially.

            if (str == null) return null;

            // Get position of last '.'.

            int pos = str.lastIndexOf(".");

            // If there wasn't any '.' just return the string as is.

            if (pos == -1) return str;

            // Otherwise return the string, up to the dot.

            return str.substring(0, pos);
        }

	private File convertMultiPartToFile(MultipartFile file) throws IOException {
		File convFile = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}

}