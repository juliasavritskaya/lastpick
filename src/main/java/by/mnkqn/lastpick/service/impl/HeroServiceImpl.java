package by.mnkqn.lastpick.service.impl;

import by.mnkqn.lastpick.client.OpendotaClient;
import by.mnkqn.lastpick.model.entity.Hero;
import by.mnkqn.lastpick.repository.HeroRepository;
import by.mnkqn.lastpick.service.HeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HeroServiceImpl implements HeroService {

  private HeroRepository heroRepository;
  private OpendotaClient opendotaClient;

  @Override
  public List<Hero> transferHeroesFromOpendotaToLocalDB() {
    List<Hero> heroesToSave = opendotaClient.findAll();
    return heroRepository.saveAll(heroesToSave);
  }
}
