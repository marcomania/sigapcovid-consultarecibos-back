package edu.moduloalumno;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import com.amazonaws.services.s3.AmazonS3;

//@Configuration
public class AmazonClientConfig {

    @Value("${cloud.aws.region.static}")
    private String region;

    @Bean
    public AmazonS3 amazonS3Client(AWSCredentialsProvider  credentialsProvider) {

        
        /*EndpointConfiguration endpointConfiguration = new EndpointConfiguration(
            "https://s3.us-east-1.amazonaws.com", "us-east-1");*/
        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(credentialsProvider)
                //.withEndpointConfiguration(endpointConfiguration)
                .withRegion(region)
                .build();
    }
}