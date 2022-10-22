package pl.piotr.biernat.app_server.users.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piotr.biernat.app_server.users.api.model.UserEntry;

@RestController
@RequestMapping("/users")
public class UsersApiEndpoint {

    @GetMapping
    public ResponseEntity<UserEntry> getUser() {
        return ResponseEntity.ok(new UserEntry("login"));
    }
}
