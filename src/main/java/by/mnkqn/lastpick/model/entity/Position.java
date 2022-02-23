package by.mnkqn.lastpick.model.entity;

public enum Position {
    CARRY(1),
    MID(2),
    OFFLANE(3),
    SEMI_SUPPORT(4),
    HARD_SUPPORT(5);

    private Integer code;

    Position(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
