package com.opentext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloWorldMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldMsApplication.class, args);
		System.out.println("HelloWorld MS started...");
	}

}
