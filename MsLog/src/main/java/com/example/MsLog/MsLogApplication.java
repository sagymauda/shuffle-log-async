package com.example.MsLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MsLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsLogApplication.class, args);
	}

}
