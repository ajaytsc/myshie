package com.tsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.tsc.util.RandomStringUtil;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@SpringBootApplication
public class AllowMePocRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllowMePocRestApplication.class, args);
		System.out.println("Application up...");
		
		/*
		 * String output =
		 * RandomStringUtil.getAlphaNumericString(6,"abcdefghijklmnopqrstuvwxyz");
		 * System.out.println("Random String output : "+output);
		 */ 
	}

}
