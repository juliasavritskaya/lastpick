package by.mnkqn.lastpick.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "heroes")
public class Hero {

    @Id
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @JsonProperty("localized_name")
    @Column(name = "localized_name", nullable = false, length = 60)
    private String localizedName;

    @JsonProperty("primary_attr")
    @Enumerated(EnumType.STRING)
    @Column(name = "primary_attribute", nullable = false, length = 60)
    private Attribute primaryAttribute;

    @JsonProperty("attack_type")
    @Enumerated(EnumType.STRING)
    @Column(name = "attack_type", nullable = false, length = 60)
    private AttackType attackType;

    @Enumerated(EnumType.STRING)
    @Column(name = "position", nullable = false, length = 60)
    private Position position;
}
