package Exame19_20.Ex1;

import java.util.HashSet;

public class Telemovel extends Produto {

    public Telemovel(String codigo, int quantidade, double preco_base, String marca, String modelo,
            HashSet<String> notas) {
        super(codigo, quantidade, preco_base);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = notas;
    }

    public Telemovel(double preco_base, String marca, String modelo, HashSet<String> notas) {
        super(preco_base);
        this.marca = marca;
        this.modelo = modelo;
        this.notas = notas;
    }

    public Telemovel (String marca, String modelo, double preco_base) {
        super(preco_base);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telemovel [marca=" + marca + ", modelo=" + modelo + ", notas=" + notas + "]";
    }

    private String marca;
    private String modelo;
    private HashSet<String> notas;

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<String> getNotas() {
        return notas;
    }

    public void setNotas(HashSet<String> notas) {
        this.notas = notas;
    }

    public void addNota(String nota) {

        notas.add(nota);
    }
}
