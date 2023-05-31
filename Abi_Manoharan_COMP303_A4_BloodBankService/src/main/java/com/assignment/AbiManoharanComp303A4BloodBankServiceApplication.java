package com.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class AbiManoharanComp303A4BloodBankServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run( AbiManoharanComp303A4BloodBankServiceApplication.class, args);
		System.out.println("Blood Bank Service Running");
	}

}
