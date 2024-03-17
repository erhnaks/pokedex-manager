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

    private final String displayEvoName;

    private Evolution(String displayName) {
        this.displayEvoName = displayName;
    }

    public String getEvoName() {
        return displayEvoName;
    }
}