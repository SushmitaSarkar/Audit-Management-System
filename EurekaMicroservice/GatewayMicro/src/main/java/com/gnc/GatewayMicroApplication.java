package com.gnc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayMicroApplication.class, args);
	}

}
