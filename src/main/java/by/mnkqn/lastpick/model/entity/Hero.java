package by.mnkqn.lastpick.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "heroes")
public class Hero {

    @Id
    private Long id;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "localized_name", nullable = false, length = 60)
    private String localizedName;

    @Enumerated(EnumType.STRING)
    @Column(name = "primary_attribute", nullable = false, length = 60)
    private Attribute primaryAttribute;

    @Enumerated(EnumType.STRING)
    @Column(name = "attack_type", nullable = false, length = 60)
    private AttackType attackType;

    @Enumerated(EnumType.STRING)
    @Column(name = "position", nullable = false, length = 60)
    private Position position;
}
