package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AbiManoharanComp303A4ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbiManoharanComp303A4ServerApplication.class, args);
	}

}
