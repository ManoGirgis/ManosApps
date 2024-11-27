package com.example.ManosApps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.ManosApps.dao")
@EntityScan("com.example.ManosApps.model")
public class ManosAppsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ManosAppsApplication.class, args);
	}
}

