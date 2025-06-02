package Exame19_20.Ex1;

import java.lang.annotation.ElementType;

import Exame19_20.Ex1.ClasseEnergetica.TipoClasseEnergetica;

public class Electrodomestico extends Produto {

    private String tipo;
    private String marca;
    private String modelo;
    private TipoClasseEnergetica classeEnergetica;
    private double potencia;


    public Electrodomestico(String tipo, String marca, String modelo, double potencia, double preco_base ) {
        super(preco_base);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;

    }

    public Electrodomestico(String tipo, String marca, String modelo, double potencia) {
        super(potencia);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;

    }


    public void addStock(int stock) {

        quantidade += stock;


    }

    @Override
    public String getDescricao() {

        return "Tipo" + "Marca" + "Modelo";
    }
    
    

}
