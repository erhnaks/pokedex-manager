package com.ozan.pokedexmanager.service.enums;

public enum Evolution {
    VMAX("VMAX"),
    VSTAR("VSTAR"),
    V("V"),
    GX("GX"),
    EX("EX"),
    BASIC("Basic"),
    STAGE_ONE("Stage One"),
    STAGE_TWO("Stage Two");

    private final String displayName;

    Evolution(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}