package pl.piotr.biernat.app_server.marker_api.api.model;

import org.springframework.stereotype.Component;
import pl.piotr.biernat.app_server.marker_api.internal.model.Marker;

@Component
public class MarkerMapper {

    public MarkerEntry map(Marker marker) {
        return new MarkerEntry(
                marker.getId(),
                marker.getLatitude(),
                marker.getLongitude());
    }

    public Marker mapAddRequest(AddMarkerRequest request) {
        return new Marker(
                request.latitude(),
                request.longitude());
    }
}
