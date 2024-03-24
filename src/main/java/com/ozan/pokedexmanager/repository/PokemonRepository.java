package com.ozan.pokedexmanager.repository;

import com.ozan.pokedexmanager.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    List<Pokemon> findByNameContainingIgnoreCase(String name);

}
