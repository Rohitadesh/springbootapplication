package com.project.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
	  @GetMapping("/health")
   	 public String health(){
        return "Service is fine";
    }
}
