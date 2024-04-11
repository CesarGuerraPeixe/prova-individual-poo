package org.serratec.poo.avaliacao.classes;

public class DJ extends Artista {
    private String estilo;

    public DJ(String nome, GeneroMusical genero, double cache, String estilo) {
        super(nome, genero, cache);
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return String.format("""
                DJ: %s
                Estilo: %s
                Cache: R$%.2f
                """, nome, estilo, cache);
    }

    @Override
    public void exibirInfoArtista() {
        System.out.println(toString());
    }
}