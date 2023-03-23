package com.example.springboothelloworld3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootHelloworld3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloworld3Application.class, args);
	}

}
