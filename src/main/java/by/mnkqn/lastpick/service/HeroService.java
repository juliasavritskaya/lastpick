package by.mnkqn.lastpick.service;

import by.mnkqn.lastpick.model.entity.Hero;

import java.util.List;

public interface HeroService {

  List<Hero> transferHeroesFromOpendotaToLocalDB();
}
