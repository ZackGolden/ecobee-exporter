package com.golden.EcobeeExporter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EcobeeExporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcobeeExporterApplication.class, args);
	}

}
