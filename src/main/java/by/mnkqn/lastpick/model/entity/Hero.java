package by.mnkqn.lastpick.model.entity;

import lombok.Data;

@Data
public class Hero {
    private Long id;
    private String name;
    private AttackType attackType;
    private Role role;
    private Position position;

}
