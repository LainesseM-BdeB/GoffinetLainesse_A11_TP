package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;

@Entity
public class Pokemon {

    @Id
    private int numeroNational;
    private int numeroRegional;
    private String nom;
    private double poids;
    private double taille;
    private String description;
    @OneToMany
    private HashSet<TypePokemon> typesPokemon;

    public Pokemon() {
    }

    public Pokemon(int numeroNational, int numeroRegional, String nom, double poids, double taille, String description, HashSet<TypePokemon> typesPokemon) {
        this.numeroNational = numeroNational;
        this.numeroRegional = numeroRegional;
        this.nom = nom;
        this.poids = poids;
        this.taille = taille;
        this.description = description;
        this.typesPokemon = typesPokemon;
    }

    public int getNumeroNational() {
        return numeroNational;
    }

    public void setNumeroNational(int numeroNational) {
        this.numeroNational = numeroNational;
    }

    public int getNumeroRegional() {
        return numeroRegional;
    }

    public void setNumeroRegional(int numeroRegional) {
        this.numeroRegional = numeroRegional;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<TypePokemon> getTypesPokemon() {
        return typesPokemon;
    }

    public void setTypesPokemon(HashSet<TypePokemon> typesPokemon) {
        this.typesPokemon = typesPokemon;
    }
}
