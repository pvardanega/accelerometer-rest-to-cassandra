package fr.duchess;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.status;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccelerationController {

    @RequestMapping(value = "/acceleration", method = POST, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity newAcceleration() {
        return status(CREATED).build();
    }
}
