package com.example.springdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class SpringDemoApplication {

    @GetMapping("/home")
    public String home() {
        log.info("Hello Jenkins World!");
        return "Hello Jenkins World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
