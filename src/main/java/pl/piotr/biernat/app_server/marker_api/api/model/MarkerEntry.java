package pl.piotr.biernat.app_server.marker_api.api.model;

import java.util.UUID;

public record MarkerEntry(
        UUID id,
        Double latitude,
        Double longitude) {
}
