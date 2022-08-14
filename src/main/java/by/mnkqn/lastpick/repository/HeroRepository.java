package by.mnkqn.lastpick.repository;

import by.mnkqn.lastpick.model.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {}
