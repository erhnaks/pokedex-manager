package com.ozan.pokedexmanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "category", nullable = false)
    private String category;
    @Column(name = "type_", nullable = false)
    private String type;
    @Column(name = "evolution_from", nullable = false)
    private String evolutionFrom;
    @Column(name = "specialization_one", nullable = false)
    private String specializationOne;
    @Column(name = "specialization_two")
    private String specializationTwo;
    @Column(name = "hp_power", nullable = false)
    private int hpPower;
    @Column(name = "weakness")
    private int weakness;
    @Column(name = "resistance")
    private int resistance;
    @Column(name = "retreat")
    private int retreat;

    public Pokemon() {};

    public Pokemon(String name, String category, String type, String evolutionFrom, String specializationOne, String specializationTwo, int hpPower, int weakness, int resistance, int retreat) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.evolutionFrom = evolutionFrom;
        this.specializationOne = specializationOne;
        this.specializationTwo = specializationTwo;
        this.hpPower = hpPower;
        this.weakness = weakness;
        this.resistance = resistance;
        this.retreat = retreat;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

    public int getHpPower() {
        return hpPower;
    }

    public void setHpPower(int hpPower) {
        this.hpPower = hpPower;
    }

    public int getWeakness() {
        return weakness;
    }

    public void setWeakness(int weakness) {
        this.weakness = weakness;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getRetreat() {
        return retreat;
    }

    public void setRetreat(int retreat) {
        this.retreat = retreat;
    }


}
