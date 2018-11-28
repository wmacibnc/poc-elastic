package com.stefanini.pocelastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class PocElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocElasticApplication.class, args);
	}
}
