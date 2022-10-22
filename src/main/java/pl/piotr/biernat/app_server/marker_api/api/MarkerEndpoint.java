package pl.piotr.biernat.app_server.marker_api.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.piotr.biernat.app_server.marker_api.api.model.AddMarkerRequest;
import pl.piotr.biernat.app_server.marker_api.api.model.MarkerEntry;
import pl.piotr.biernat.app_server.marker_api.api.model.MarkerMapper;
import pl.piotr.biernat.app_server.marker_api.internal.MarkerService;

import java.util.List;

@RestController
@RequestMapping(value = "markers")
public class MarkerEndpoint {

    private final MarkerService markerService;
    private final MarkerMapper markerMapper;

    public MarkerEndpoint(MarkerService markerService, MarkerMapper markerMapper) {
        this.markerService = markerService;
        this.markerMapper = markerMapper;
    }


    @GetMapping
    public ResponseEntity<List<MarkerEntry>> getMarkers() {
        var markers = markerService.getMarkers().stream()
                .map(markerMapper::map)
                .toList();
        return ResponseEntity.ok(markers);
    }

    @PostMapping
    public ResponseEntity<Void> addMarker(@RequestBody AddMarkerRequest addMarkerRequest) {
        markerService.addMarker(markerMapper.mapAddRequest(addMarkerRequest));
        return ResponseEntity.ok().build();
    }
}
