package Exame19_20.Ex1;

import java.lang.annotation.ElementType;


public class Electrodomestico extends Produto {

    private String tipo;
    private String marca;
    private String modelo;
    private ClasseEnergetica classeEnergetica;
    private double potencia;
    private ClasseEnergetica classe;


    public Electrodomestico(String tipo, String marca, String modelo, double potencia, double preco_base ) {
        super(preco_base, 'E');
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;

    }

    public Electrodomestico(String tipo, String marca, String modelo, double potencia) {
        super(potencia, 'E');
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;

    }


    public void addStock(int stock) {

        quantidade += stock;


    }

    @Override
    public String getDescricao() {

        return getTipo() + ":" + getMarca() + "/" +getModelo();
    }
    
    public void setClasse(ClasseEnergetica classe) {

        this.classe = classe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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

    public ClasseEnergetica getClasseEnergetica() {
        return classeEnergetica;
    }

    public void setClasseEnergetica(ClasseEnergetica classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public ClasseEnergetica getClasse() {
        return classe;
    }
    

}
