package aula08.Ex2;

import java.util.ArrayList;
import java.util.Objects;

public class Prato implements Comparable<Prato> {

    private String nome;
    private ArrayList<Alimento> alimentos;

    public Prato(String nome) {

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

    @Override
    public String toString() {
        return "Prato: " + nome + ", Calorias: " + getTotalCalorias() + ", Proteínas: " + getTotalProteinas();
    }

    @Override
    public int compareTo(Prato outro) {
        return Double.compare(this.getTotalCalorias(), outro.getTotalCalorias());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prato prato = (Prato) obj;
        return nome.equals(prato.nome) && alimentos.equals(prato.alimentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, alimentos);
    }

    public enum VariedadeCarne {
        VACA, PORCO, PERU, FRANGO, OUTRA
    }
    
    public enum TipoPeixe {
        CONGELADO, FRESCO
    }
}
