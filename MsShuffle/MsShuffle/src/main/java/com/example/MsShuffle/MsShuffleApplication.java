package com.example.MsShuffle;

import com.example.MsShuffle.configuration.ConfigureUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MsShuffleApplication implements CommandLineRunner {

	@Autowired
	ConfigureUrl configureUrl;

	public static void main(String[] args) {
		SpringApplication.run(MsShuffleApplication.class, args);
	}


	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(configureUrl.getUrl());
	}

}
