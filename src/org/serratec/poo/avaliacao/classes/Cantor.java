package org.serratec.poo.avaliacao.classes;

public class Cantor extends Artista {
    public Cantor(String nome, GeneroMusical genero, double cache) {
        super(nome, genero, cache);
    }

    @Override
    public String toString() {
        return String.format("""
                Cantor: %s
                Gênero: %s
                Cache: R$%.2f
                """, nome, genero, cache);
    }

    @Override
    public void exibirInfoArtista() {
        System.out.println(toString());
    }
}