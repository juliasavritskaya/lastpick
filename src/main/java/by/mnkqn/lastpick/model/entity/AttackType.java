package by.mnkqn.lastpick.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttackType {

    @JsonProperty("Ranged")
    RANGE(1),

    @JsonProperty("Melee")
    MELEE(2);

    private Integer code;

    AttackType(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
