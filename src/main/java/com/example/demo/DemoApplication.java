package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//RestController
@SpringBootApplication
public class DemoApplication {
	/*
	 * @RequestMapping("/") public String Index() { return "Hello"; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
