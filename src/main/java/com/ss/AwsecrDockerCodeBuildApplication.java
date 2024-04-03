package com.ss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsecrDockerCodeBuildApplication {

	@GetMapping("/getMessage")
	public String getMessage()
	{
		return "hello Naresh";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AwsecrDockerCodeBuildApplication.class, args);
	}

}
