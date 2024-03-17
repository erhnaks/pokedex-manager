package com.ozan.pokedexmanager.service;

import com.ozan.pokedexmanager.entity.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> getAllPokemon();

    Pokemon savePokemon(Pokemon pokemon);

}
