package com.eds.encrypted_data_sharing_svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EncryptedDataSharingSvcApplication {
	public static void main(String[] args) {
		SpringApplication.run(EncryptedDataSharingSvcApplication.class, args);
		log.info("*** Service Activated ***");
	}
}