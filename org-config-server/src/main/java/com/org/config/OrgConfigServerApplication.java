package com.org.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OrgConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgConfigServerApplication.class, args);
	}

}
