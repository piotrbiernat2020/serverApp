package pl.piotr.biernat.app_server.marker_api.internal;

import org.springframework.stereotype.Service;
import pl.piotr.biernat.app_server.marker_api.internal.model.Marker;

import java.util.List;

@Service
public class MarkerService {

    private final MarkerRepository markerRepository;

    public MarkerService(MarkerRepository markerRepository) {
        this.markerRepository = markerRepository;
    }

    public List<Marker> getMarkers() {
        return markerRepository.findAll();
    }

    public void addMarker(Marker marker) {
        markerRepository.save(marker);
    }
}
