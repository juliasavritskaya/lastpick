package by.mnkqn.lastpick.model.entity;

public enum Role {
    Initiator(1),
    Durable(2);

    private Integer code;

    Role(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
