package com.server.serverservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerService2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServerService2Application.class, args);
	}

}
