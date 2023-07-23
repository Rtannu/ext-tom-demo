package com.ext.tom.exttomdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExtTomDemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExtTomDemoApplication.class, args);
	}

}
