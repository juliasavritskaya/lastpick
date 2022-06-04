package by.mnkqn.lastpick.model.entity;

public enum Attribute {
    STRENGTH(1),
    AGILITY(2),
    INTELLIGENCE(3);

    private Integer code;

    Attribute(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
