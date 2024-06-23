package com.mscm.mySCM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyScmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyScmApplication.class, args);
		System.out.println(">>> initializing My Smart Contact Manager");
	}

}
