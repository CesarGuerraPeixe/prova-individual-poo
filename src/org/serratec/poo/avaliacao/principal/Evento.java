package org.serratec.poo.avaliacao.principal;

import org.serratec.poo.avaliacao.classes.*;

public class Evento {
    public static void main(String[] args) {

        Cantor iza = new Cantor("Iza", GeneroMusical.POP, 15000);
        Banda redHotChilliPeppers = new Banda("Red Hot Chilli Peppers", GeneroMusical.ROCK, 200000, 4);
        Cantor ludmila = new Cantor("Ludmila", GeneroMusical.FUNK, 10000);
        Banda theCure = new Banda("The Cure", GeneroMusical.ROCK, 250000, 5);
        DJ steveAoki = new DJ("Steve Aoki", GeneroMusical.ELETRONICO, 50000, "House");
        DJ felguk = new DJ("Felguk", GeneroMusical.ELETRONICO, 50000, "Dance");

        Palco palcoPrincipal = new Palco("Palco Principal", 20000);
        palcoPrincipal.adicionarHorario(new Horario("20/05/2024", "19:00", iza));
        palcoPrincipal.adicionarHorario(new Horario("20/05/2024", "22:00", redHotChilliPeppers));
        palcoPrincipal.adicionarHorario(new Horario("21/05/2024", "18:00", ludmila));
        palcoPrincipal.adicionarHorario(new Horario("21/05/2024", "23:00", theCure));

        Palco palcoEletronico = new Palco("Palco Eletrônico", 10000);
        palcoEletronico.adicionarHorario(new Horario("20/05/2024", "21:00", steveAoki));
        palcoEletronico.adicionarHorario(new Horario("21/05/2024", "21:00", felguk));
        
        Festival festival = new Festival(new Palco[]{palcoPrincipal, palcoEletronico});
        festival.exibirProgramacao();
    }
}