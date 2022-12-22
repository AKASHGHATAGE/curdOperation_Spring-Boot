package com.example.curd_operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude={JacksonAutoConfiguration.class, JmxAutoConfiguration.class})
public class CurdOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdOperationApplication.class, args);
	}
	

}
	