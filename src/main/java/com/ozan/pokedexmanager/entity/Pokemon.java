package com.ozan.pokedexmanager.entity;

import com.ozan.pokedexmanager.service.enums.Evolution;
import com.ozan.pokedexmanager.service.enums.Type;
import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated(EnumType.STRING)
    private Evolution evolution;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column(name = "evolution_from")
    private String evolutionFrom;
    @Column(name = "specialization_one")
    private String specializationOne;
    @Column(name = "specialization_two")
    private String specializationTwo;
    private BigInteger health;
    private BigInteger weakness;
    private BigInteger resistance;
    private BigInteger retreat;

    private String description;

    public Pokemon() {}

    public Pokemon(String name, Evolution evolution, Type type, String evolutionFrom, String specializationOne, String specializationTwo, BigInteger health, BigInteger weakness, BigInteger resistance, BigInteger retreat, String description) {
        this.name = name;
        this.evolution = evolution;
        this.type = type;
        this.evolutionFrom = evolutionFrom;
        this.specializationOne = specializationOne;
        this.specializationTwo = specializationTwo;
        this.health = health;
        this.weakness = weakness;
        this.resistance = resistance;
        this.retreat = retreat;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Evolution getEvolution() {
        return evolution;
    }

    public void setEvolution(Evolution evolution) {
        this.evolution = evolution;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getEvolutionFrom() {
        return evolutionFrom;
    }

    public void setEvolutionFrom(String evolutionFrom) {
        this.evolutionFrom = evolutionFrom;
    }

    public String getSpecializationOne() {
        return specializationOne;
    }

    public void setSpecializationOne(String specializationOne) {
        this.specializationOne = specializationOne;
    }

    public String getSpecializationTwo() {
        return specializationTwo;
    }

    public void setSpecializationTwo(String specializationTwo) {
        this.specializationTwo = specializationTwo;
    }

    public BigInteger getHealth() {
        return health;
    }

    public void setHealth(BigInteger health) {
        this.health = health;
    }

    public BigInteger getWeakness() {
        return weakness;
    }

    public void setWeakness(BigInteger weakness) {
        this.weakness = weakness;
    }

    public BigInteger getResistance() {
        return resistance;
    }

    public void setResistance(BigInteger resistance) {
        this.resistance = resistance;
    }

    public BigInteger getRetreat() {
        return retreat;
    }

    public void setRetreat(BigInteger retreat) {
        this.retreat = retreat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
