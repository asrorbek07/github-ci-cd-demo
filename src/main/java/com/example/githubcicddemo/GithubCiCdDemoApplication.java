package com.example.githubcicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@SpringBootApplication
public class GithubCiCdDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubCiCdDemoApplication.class, args);
    }
@GetMapping("get")
    public String get(){
        return "Hello world";
}
}
