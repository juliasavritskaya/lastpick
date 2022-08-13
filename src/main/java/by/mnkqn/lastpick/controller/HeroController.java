package by.mnkqn.lastpick.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
public class HeroController {

    String baseUrl = "https://api.opendota.com/api";

    @GetMapping
    public ResponseEntity<String> findheroes() {
        RestTemplate template = new RestTemplate();
        String fooResourceUrl
                = baseUrl + "/heroes";
        ResponseEntity<String> response
                = template.getForEntity(fooResourceUrl, String.class);
        return response;
    }

}
