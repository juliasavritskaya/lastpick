package by.mnkqn.lastpick.controller;

import by.mnkqn.lastpick.client.OpendotaClient;
import by.mnkqn.lastpick.mapping.RequestsMapping;
import by.mnkqn.lastpick.model.entity.Hero;
import by.mnkqn.lastpick.service.HeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(RequestsMapping.HEROES_URL)
public class HeroController {

  private final OpendotaClient opendotaClient;
  private final HeroService heroService;

  @GetMapping
  public ResponseEntity<List<Hero>> findheroes() {
    final List<Hero> heroes = opendotaClient.findAll();
    return new ResponseEntity<>(heroes, HttpStatus.OK);
  }

  @PostMapping(RequestsMapping.SAVE_HEROES_TO_DB)
  public ResponseEntity<List<Hero>> transferHeroesListToLocalDB() {
    List<Hero> savedHeroes = heroService.transferHeroesFromOpendotaToLocalDB();
    return ResponseEntity.ok(savedHeroes);
  }
}
