package Learning9.Ex2;

import java.util.ArrayList;
import java.util.Map;

public class Ementa{

    private String nome;
    private String local;

    private Map<DiaSemana, ArrayList<Prato>> lista_pratos;


    public Ementa(String nome, String local, Map<DiaSemana, ArrayList<Prato>> lista_pratos) {
        this.nome = nome;
        this.local = local;
        this.lista_pratos = lista_pratos;
    }

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public void addPrato(Prato p, DiaSemana diaSemana) {
        lista_pratos.get(diaSemana).add(p);
    }



    public enum VariedadeCarne {
        VACA,
        PORCO,
        PERU,
        FRANGO,
        OUTRA
    }

    public enum TipoPeixe {
        CONGELADO,
        FRESCO
    }

    public enum DiaSemana {

        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        Quinta,
        Sexta,
        Sábado

    }

}
