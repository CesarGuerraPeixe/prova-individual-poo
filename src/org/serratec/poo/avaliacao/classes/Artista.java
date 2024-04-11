package org.serratec.poo.avaliacao.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Artista {
    protected String nome;
    protected GeneroMusical genero;
    protected double cache;

    public Artista(String nome, GeneroMusical genero, double cache) {
        this.nome = nome;
        this.genero = genero;
        this.cache = cache;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public String getNome() {
        return nome;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public abstract void exibirInfoArtista();
}