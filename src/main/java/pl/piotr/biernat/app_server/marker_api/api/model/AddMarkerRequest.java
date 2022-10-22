package pl.piotr.biernat.app_server.marker_api.api.model;

public record AddMarkerRequest(
        Double latitude,
        Double longitude) {
}
