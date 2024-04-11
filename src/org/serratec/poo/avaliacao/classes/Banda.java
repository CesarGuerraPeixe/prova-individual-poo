package org.serratec.poo.avaliacao.classes;

public class Banda extends Artista {
    private int numIntegrantes;

    public Banda(String nome, GeneroMusical genero, double cache, int numIntegrantes) {
        super(nome, genero, cache);
        this.numIntegrantes = numIntegrantes;
    }

    @Override
    public String toString() {
        return String.format("""
                Banda: %s
                Gênero: %s
                Cache: R$%.2f
                Número de integrantes: %d
                """, nome, genero, cache, numIntegrantes);
    }

    @Override
    public void exibirInfoArtista() {
        System.out.println(toString());
    }
}