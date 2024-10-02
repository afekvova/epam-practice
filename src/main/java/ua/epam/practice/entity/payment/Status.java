package ua.epam.practice.entity.payment;

import java.io.Serializable;

public enum Status implements Serializable {

    SUCCESS("Успішно"),
    DENY("Відхилено");

    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public final static Status[] VALUES = values();
}
