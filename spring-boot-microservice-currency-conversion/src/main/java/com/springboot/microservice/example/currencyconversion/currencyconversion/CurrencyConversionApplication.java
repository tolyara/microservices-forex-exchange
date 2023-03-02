package com.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion.classes")
@EnableDiscoveryClient
public class CurrencyConversionApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBootMicroserviceCurrencyConversionApplication.class);
	
	public static void main(String[] args) {
	    try {
	        SpringApplication.run(SpringBootMicroserviceCurrencyConversionApplication.class, args);
	    } catch (Throwable e) {
	        if(e.getClass().getName().contains("SilentExitException")) {
	            logger.debug("Spring is finish booting the main thread - See spring-boot-devtools");
	        } else {
	            logger.error("Application crashed!", e);
	        }
	    }
	}

}
