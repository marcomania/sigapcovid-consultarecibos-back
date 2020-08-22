/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.api;
import edu.moduloalumno.service.impl.AmazonClient;
/**
 *
 * @author JUNIOR
 */
import com.amazonaws.services.s3.event.S3EventNotification;
import edu.moduloalumno.entity.FileAWS;
//import com.org.tech.s3poc.FileAWS;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//import com.org.tech.s3poc.serviceimpl.AmazonClient;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
@RequestMapping("/v1/storage/")
public class BucketController {
        
    
	private AmazonClient amazonClient;

	@Autowired
	BucketController(AmazonClient amazonClient) {
		this.amazonClient = amazonClient;
	}
            /*
	@PostMapping("/uploadFile")
	public String uploadFile(@RequestPart(value = "file") MultipartFile file) throws IOException {
		return this.amazonClient.uploadFile(file);
	}*/
        
        @PostMapping("/uploadFile/{id}")
	public String uploadFile(@PathVariable String id,@RequestPart(value = "file") MultipartFile file) throws IOException {
		return this.amazonClient.uploadFile(id,file);
	}

	@DeleteMapping("/deleteFile")
	public String deleteFile(@RequestPart(value = "url") String fileUrl) {
		return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
	}
        
        @GetMapping(path = "/download/{id}")
        public ResponseEntity<byte[]> getFile(@PathVariable String id)  {
        /*byte[] data = s3Factory.getFile(file);
        ByteArrayResource resource = new ByteArrayResource(data);*/
            String keyname = id;
            ByteArrayOutputStream downloadInputStream= amazonClient.getFile(keyname);
            //ByteArrayResource resource = new ByteArrayResource(data);
            

        return ResponseEntity
                .ok()
                .header("Content-disposition", "attachment; filename=\"" + keyname + "\"")
                .body(downloadInputStream.toByteArray());

    }
        
        @GetMapping(path = "/getFileFromFolder/{id}")
        public ResponseEntity<ArrayList<FileAWS>> getFileFromFolder(@PathVariable String id)  {
        /*byte[] data = s3Factory.getFile(file);
        ByteArrayResource resource = new ByteArrayResource(data);*/
            String keyname = id;
            ArrayList<FileAWS> list = null;
            //ByteArrayOutputStream downloadInputStream= amazonClient.getFileFromFolder(keyname);
            //ByteArrayResource resource = new ByteArrayResource(data);
            try {
			list = amazonClient.getFileFromFolder(keyname);
			
			if (list == null) {
				list = new ArrayList<FileAWS>();
			}
		} catch (Exception e) {
			//logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<ArrayList<FileAWS>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		//logger.info("< getAlumnoIdByNombresApellidosRestringido [Alumno]");
		return new ResponseEntity<ArrayList<FileAWS>>(list, HttpStatus.OK);
            

        //return ;
    }
}