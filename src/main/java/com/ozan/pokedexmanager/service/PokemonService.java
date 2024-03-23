package com.ozan.pokedexmanager.service;

import com.ozan.pokedexmanager.entity.Pokemon;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PokemonService {

    List<Pokemon> getAllPokemon();
    Page<Pokemon> findPaginated(int page, int size);


    Pokemon savePokemon(Pokemon pokemon);

}
