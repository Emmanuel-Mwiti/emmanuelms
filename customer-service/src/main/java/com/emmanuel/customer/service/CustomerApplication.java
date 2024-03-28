package com.emmanuel.customer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
        System.out.println("Hello World!");
        String originalString = "Hello";
        System.out.println("Original String: " + originalString);

        for (int i = 0; i < 3; i++) {
            // Modify the string inside the loop
            originalString += " World";
            System.out.println("Modified String inside loop: " + originalString);
        }

        // After the loop, originalString remains unchanged
        System.out.println("Original String outside loop: " + originalString);
    }
}
