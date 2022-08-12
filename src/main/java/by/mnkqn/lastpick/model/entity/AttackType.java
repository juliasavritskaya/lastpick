package by.mnkqn.lastpick.model.entity;

public enum AttackType {
    RANGE(1),
    MELEE(2);

    private Integer code;

    AttackType(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
