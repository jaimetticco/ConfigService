package com.idat.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfingServerIdatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfingServerIdatApplication.class, args);
	}

}
