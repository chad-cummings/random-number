package com.ctech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class RandomNumberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomNumberServiceApplication.class, args);
    }
}
