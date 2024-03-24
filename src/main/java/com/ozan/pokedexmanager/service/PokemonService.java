package com.ozan.pokedexmanager.service;

import com.ozan.pokedexmanager.entity.Pokemon;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PokemonService {

    List<Pokemon> getAllPokemon();
    Pokemon savePokemon(Pokemon pokemon);

    Pokemon updatePokemon(Pokemon pokemon);

    Pokemon getPokemonById(Long id);

    void deletePokemonById(Long id);

}
