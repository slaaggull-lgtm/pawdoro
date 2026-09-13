package com.pawdoro.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point of the Pawdoro backend service.
 *
 * <p>Week 1 scope: this class only boots a Spring Boot application wired to a
 * PostgreSQL data source. Domain entities, security and business endpoints
 * are introduced in later weeks of the roadmap.</p>
 */
@SpringBootApplication
public class PawdoroBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PawdoroBackendApplication.class, args);
    }
}
