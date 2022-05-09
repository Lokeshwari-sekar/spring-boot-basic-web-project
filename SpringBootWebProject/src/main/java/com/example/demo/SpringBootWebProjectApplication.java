package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.controller.HelloSpringBoot;




@SpringBootApplication
public class SpringBootWebProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cob=SpringApplication.run(SpringBootWebProjectApplication.class, args);
		
	HelloSpringBoot ob=cob.getBean(HelloSpringBoot.class);

	ob.display();
	
	
	}

}
