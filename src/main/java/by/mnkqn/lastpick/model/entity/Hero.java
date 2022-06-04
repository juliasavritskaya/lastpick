package by.mnkqn.lastpick.model.entity;

import lombok.Data;

@Data
public class Hero {
    private Long id;
    private String name;
    private String publicName;
    private AttackType attackType;
    private Attribute primaryAttribute;
    private Position position;
    private Float winrate;
}
