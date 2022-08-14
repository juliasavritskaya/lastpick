package by.mnkqn.lastpick.client;

import by.mnkqn.lastpick.model.entity.Hero;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class OpendotaClient {

    String baseurl = "https://api.opendota.com/api";
    WebClient client = WebClient.create(baseurl);

//    public Flux<Hero> findAll() throws Exception {
//        return client.get()
//                .uri("/heroes/111/matches")
//                .retrieve()
//                .bodyToFlux(Hero.class);
//    }

    public List<Hero> findAll() {
        final RestTemplate template = new RestTemplate();
        final String url = baseurl + "/heroes";
        final ResponseEntity<String> result = template.getForEntity(url, String.class);
        final String json = result.getBody();
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        List<Hero> heroes = new ArrayList<>();
        try {
            heroes = mapper.readValue(json, new TypeReference<List<Hero>>() {
            });
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return heroes;
    }
}
