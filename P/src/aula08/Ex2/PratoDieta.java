package aula08.Ex2;

import java.util.ArrayList;

public class PratoDieta {

    private String nome;
    private ArrayList<Alimento> alimentos;

    public PratoDieta(String nome) {

        this.nome = nome;
        this.alimentos = new ArrayList<>();


    }

    public boolean addIngrediente(Alimento a) {
        return alimentos.add(a);
    }

    public double getTotalPeso() {
        return alimentos.stream().mapToDouble(Alimento::getPeso).sum();
    }

    public double getTotalCalorias() {
        return alimentos.stream().mapToDouble(Alimento::getCalorias).sum();
    }

    public double getTotalProteinas() {
        return alimentos.stream().mapToDouble(Alimento::getProteinas).sum();
    }

}
