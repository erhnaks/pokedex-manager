package com.ozan.pokedexmanager.service.impl;

import com.ozan.pokedexmanager.entity.Pokemon;
import com.ozan.pokedexmanager.repository.PokemonRepository;
import com.ozan.pokedexmanager.service.PokemonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PokemonServiceImpl  implements PokemonService {

    private PokemonRepository repository;

    public PokemonServiceImpl(PokemonRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        return repository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }



    @Override
    public Pokemon savePokemon(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    @Override
    public Pokemon updatePokemon(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    @Override
    public Pokemon getPokemonById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deletePokemonById(Long id) {
        repository.deleteById(id);
    }
}
