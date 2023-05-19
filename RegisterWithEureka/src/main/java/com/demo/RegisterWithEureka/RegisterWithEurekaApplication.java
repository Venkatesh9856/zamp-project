package com.demo.RegisterWithEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterWithEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterWithEurekaApplication.class, args);
	}

}
