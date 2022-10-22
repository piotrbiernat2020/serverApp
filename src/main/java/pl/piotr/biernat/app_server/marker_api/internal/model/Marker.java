package pl.piotr.biernat.app_server.marker_api.internal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "markers")
public class Marker {

    @Id
    private UUID id;
    private Double latitude;
    private Double longitude;

    public Marker(Double latitude, Double longitude) {
        this.id = UUID.randomUUID();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Marker() {
    }

    public UUID getId() {
        return id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}