package org.serratec.poo.avaliacao.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
    private String nome;
    private int capacidade;
    private List<Horario> horarios = new ArrayList<>();

    public Palco(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void adicionarHorario(Horario horario) {
        horarios.add(horario);
    }

    public void exibirProgramacao() {
        System.out.println();
        for (Horario horario : horarios) {
            System.out.println(horario);
        }
    }
}