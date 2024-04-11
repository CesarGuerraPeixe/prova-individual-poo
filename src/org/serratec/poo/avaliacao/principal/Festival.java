package org.serratec.poo.avaliacao.principal;

import org.serratec.poo.avaliacao.classes.*;

public class Festival {
    private Palco[] palcos;

    public Festival(Palco[] palcos) {
        this.palcos = palcos;
    }

    public void exibirProgramacao() {
        System.out.println("Programação do Festival:");

        for (Palco palco : palcos) {
            System.out.println("\n" + palco.getNome() + ":");
            palco.exibirProgramacao();
        }
    }
}
