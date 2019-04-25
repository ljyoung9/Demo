package com.example.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//RestController
@SpringBootApplication
//@ComponentScan("com.in28minutes.springboot")
@ComponentScan({"com.example.web"})
@MapperScan(basePackages = "com.example.web")
public class DemoApplication {
	/*
	 * @RequestMapping("/") public String Index() { return "Hello"; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
}
