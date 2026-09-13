package com.pawdoro.backend.dto;

/**
 * Minimal response payload returned by {@code GET /api/v1/ping}.
 *
 * @param status  fixed literal, always {@code "ok"} when the service is up
 * @param service name of the running service
 * @param version current application version, taken from {@code pom.xml}
 */
public record StatusResponse(String status, String service, String version) {
}
