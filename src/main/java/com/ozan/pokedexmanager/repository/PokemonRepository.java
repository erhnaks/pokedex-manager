package com.ozan.pokedexmanager.repository;

import com.ozan.pokedexmanager.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {



}
