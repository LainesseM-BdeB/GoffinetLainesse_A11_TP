package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;

@Entity
public class TypePokemon {

    @Id
    private String type;
    @OneToMany
    private HashSet<Pokemon> pokemons;

    public TypePokemon() {
    }

    public TypePokemon(String type, HashSet<Pokemon> pokemons) {
        this.type = type;
        this.pokemons = pokemons;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashSet<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(HashSet<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
