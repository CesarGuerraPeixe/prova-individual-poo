package org.serratec.poo.avaliacao.classes;

public class Horario {
    private String data;
    private String hora;
    private Artista artista;

    public Horario(String data, String hora, Artista artista) {
        this.data = data;
        this.hora = hora;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", data, hora, artista.getNome());
    }
}
