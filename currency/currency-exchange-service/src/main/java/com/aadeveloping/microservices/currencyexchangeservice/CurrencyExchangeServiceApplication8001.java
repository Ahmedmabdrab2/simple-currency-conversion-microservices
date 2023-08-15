package com.aadeveloping.microservices.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class CurrencyExchangeServiceApplication8001 {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication8001.class, args);
	}

}
