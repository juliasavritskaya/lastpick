package by.mnkqn.lastpick.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Attribute {

    @JsonProperty("str")
    STRENGTH(1),

    @JsonProperty("agi")
    AGILITY(2),

    @JsonProperty("int")
    INTELLIGENCE(3);

    private Integer code;

    Attribute(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
