package com.ozan.pokedexmanager.service.enums;

public enum Type {
    BUG("Bug"),
    DARK("Dark"),
    DRAGON("Dragon"),
    ELECTRIC("Electric"),
    FAIRY("Fairy"),
    FIGHTING("Fighting"),
    FIRE("Fire"),
    FLYING("Flying"),
    GHOST("Ghost"),
    GRASS("Grass"),
    GROUND("Ground"),
    ICE("Ice"),
    NORMAL("Normal"),
    POISON("Poison"),
    PSYCHIC("Psychic"),
    ROCK("Rock"),
    STEEL("Steel"),
    WATER("Water");

    private final String TypeName;

    private Type(String displayName) {
        this.TypeName = displayName;
    }


public String getTypeName() {
        return TypeName;
}
}
