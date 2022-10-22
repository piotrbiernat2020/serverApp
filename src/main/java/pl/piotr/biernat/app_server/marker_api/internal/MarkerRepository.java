package pl.piotr.biernat.app_server.marker_api.internal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.piotr.biernat.app_server.marker_api.internal.model.Marker;

import java.util.UUID;

@Repository
public interface MarkerRepository extends JpaRepository<Marker, UUID> {
}
