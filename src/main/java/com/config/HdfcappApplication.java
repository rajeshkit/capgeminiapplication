package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HdfcappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfcappApplication.class, args);
	}
	@GetMapping("/hello")
	public String welcome() {
		return "welcome to spring boot docker application";
	}
	@GetMapping("/")
	public String welcome1() {
		return "welcome to docker app";
	}

}
