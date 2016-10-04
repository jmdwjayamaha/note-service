package com.pearson.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot application entry point
 * 
 * @author Danushka Jayamaha
 *
 */
@SpringBootApplication
public class Application {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}