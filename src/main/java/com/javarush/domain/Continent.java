package com.javarush.domain;

public enum Continent {

    ASIA("0"),
    EUROPE("1"),
    NORTH_AMERICA("2"),
    AFRICA("3"),
    OCEANIA("4"),
    ANTARCTICA("5"),
    SOUTH_AMERICA("6");

    private final String value;

    Continent(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
