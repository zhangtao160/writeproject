package com.zt.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class WriteBugApplication {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(WriteBugApplication.class, args);
    }
}
