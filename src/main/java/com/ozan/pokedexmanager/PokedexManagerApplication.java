package com.ozan.pokedexmanager;

import com.ozan.pokedexmanager.entity.Pokemon;
import com.ozan.pokedexmanager.repository.PokemonRepository;
import com.ozan.pokedexmanager.service.enums.Evolution;
import com.ozan.pokedexmanager.service.enums.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokedexManagerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PokedexManagerApplication.class, args);
    }

    @Autowired
    private PokemonRepository repository;

    @Override
    public void run(String... args) throws Exception {

//        Pokemon pokemon1 = new Pokemon("Pikachu", Evolution.VSTAR, Type.ELECTRIC, "Pika", "Super Pokemon", "Electrifying",
//                400, 2, 4, 1, "Super Pokemon");
//        repository.save(pokemon1);
//
//        Pokemon pokemon2 = new Pokemon("SnoorLax", Evolution.EX, Type.NORMAL, "Snoorer", "Super Loud", "Lazzyyyy",
//                100, 4, 3, 1, "Super Lazzyyy and sleeppppyy");
//        repository.save(pokemon2);

    }
}
