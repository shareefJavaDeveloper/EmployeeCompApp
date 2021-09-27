package com.comp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.comp"})
@EnableAutoConfiguration
public class EmployeeCompAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCompAppApplication.class, args);
	}

}
