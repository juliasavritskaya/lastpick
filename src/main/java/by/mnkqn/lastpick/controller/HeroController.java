package by.mnkqn.lastpick.controller;

import by.mnkqn.lastpick.client.OpendotaClient;
import by.mnkqn.lastpick.mapping.OpendotaMapping;
import by.mnkqn.lastpick.model.entity.Hero;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(by.mnkqn.lastpick.mapping.RequestMapping.HEROES_URL)
public class HeroController {

    private final OpendotaClient opendotaClient;

    @GetMapping
    public ResponseEntity<List<Hero>> findheroes() {
        final List<Hero> heroes = opendotaClient.findAll();
        return new ResponseEntity<>(heroes, HttpStatus.OK);
    }

}
