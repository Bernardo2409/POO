package Learning9.Ex2;

import java.util.ArrayList;

public class Prato implements Comparable<Prato>{

    private String nome;
    private ArrayList <Alimento> composicao;
    private static int nextId = 1;
    private int id;

    public Prato(String nome) {
        this.nome = nome;
        this.composicao = new ArrayList<Alimento>();
        this.id = nextId++;
    }

    

    public int getId() {

        return id;
    }

    // calorais totais
    public double caloriasTotais() {
        double total = 0;
        for ( Alimento a : composicao) {

            total += a.getCalorias();
        }

        return total;

    }

    public boolean addIngrediente(Alimento aux) {

        composicao.add(aux);

        return true;

    }


    @Override
    public int compareTo(Prato outro) {
        double caloriasEste = this.caloriasTotais();
        double caloriasOutro = outro.caloriasTotais();

    return Double.compare(caloriasEste, caloriasOutro);
}

    @Override
    public String toString() {
        return "Prato 'combinado n.'" + getId() + ", composto por 0 ingredientes";
    }
}


