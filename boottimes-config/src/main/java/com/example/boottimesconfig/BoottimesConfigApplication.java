package com.example.boottimesconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BoottimesConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoottimesConfigApplication.class, args);
	}

}
