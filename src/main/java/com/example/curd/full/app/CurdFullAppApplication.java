package com.example.curd.full.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class})
public class CurdFullAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(CurdFullAppApplication.class, args);
		System.out.println("hello");
	}

}
