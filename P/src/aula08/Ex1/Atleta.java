package aula08.Ex1;

public class Atleta implements IKmPercorridos {
    
    private String nome;
    private int km_totais;
    private int ultimo_km;
    private Telemovel telemovel;

    public Atleta(String nome, Telemovel telemovel) {
        this.nome = nome;
        this.telemovel = telemovel;
    }

    public void trajeto(int quilometros) {
        this.ultimo_km = quilometros;
        this.km_totais += quilometros;
    }

    public int ultimoTrajeto() {
        return this.ultimo_km;
    }

    public int distanciaTotal() {
        return this.km_totais;
    }

    public Telemovel getTelemovel() {
        return telemovel;
    }

    public String toString() {
        return "Atleta " + nome + " (" + telemovel + ")";
    }

}
