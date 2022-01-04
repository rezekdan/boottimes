package com.example.boottimesclient;

import com.example.boottimesclient.config.BootTimesConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({BootTimesConfiguration.class})
public class BoottimesClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoottimesClientApplication.class, args);
	}

}
