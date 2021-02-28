package com.anuj.org.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.anuj.org")
public class SpringBootExampleRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleRestApplication.class, args);
    }

}