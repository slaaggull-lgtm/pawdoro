package com.pawdoro.backend.controller;

import com.pawdoro.backend.dto.StatusResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Lightweight endpoint used to confirm that the Week 1 backend skeleton is
 * built, running, and reachable over HTTP. This complements Spring Boot
 * Actuator's {@code /actuator/health} endpoint with an application-level
 * check that does not depend on internal Actuator response shape.
 */
@RestController
@RequestMapping("/api/v1")
public class PingController {

    private static final String SERVICE_NAME = "pawdoro-backend";

    @Value("${pawdoro.app.version:0.1.0}")
    private String appVersion;

    @GetMapping("/ping")
    public StatusResponse ping() {
        return new StatusResponse("ok", SERVICE_NAME, appVersion);
    }
}
