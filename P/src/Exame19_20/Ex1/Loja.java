package Exame19_20.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;


public class Loja {


    @Override
    public String toString() {
        return "Loja " + nome ;
    }

    private String nome;
    private String endereco_web;
    private ArrayList<Produto> loja;

    public Loja(String nome, String endereco_web) {
        this.nome = nome;
        this.endereco_web = endereco_web;
        this.loja = new ArrayList<>();
    }

    public int totalItems() {
        int items = 0;

        for (Produto p : loja) {
           items += p.getQuantidade();

        }

        return items;
    }
    
    public void add(Produto p) {

        loja.add(p);
    }


    public String getProdutoPelaDescricao(String descricao) {
    if (descricao.contains(":")) {
        // Caso Electrodoméstico ou outros com tipo:marca/modelo
        String[] lista = descricao.split(":");
        String tipoDescricao = lista[0];
        String nomemarca = lista[1];
        String[] lista2 = nomemarca.split("/");
        String marcaDescricao = lista2[0];
        String modeloDescricao = lista2[1];

        for (Produto p : loja) {
            if (p instanceof Electrodomestico) {
                Electrodomestico e = (Electrodomestico) p;
                if (e.getTipo().equalsIgnoreCase(tipoDescricao) &&
                    e.getMarca().equalsIgnoreCase(marcaDescricao) &&
                    e.getModelo().equalsIgnoreCase(modeloDescricao)) {
                    return e.getClass().getSimpleName() + e;
                }
            }
            // Se houver outros tipos, podes adicionar aqui
        }
    } else if (descricao.contains("/")) {
        // Caso Telemóvel, só marca/modelo
        String[] lista = descricao.split("/");
        String marcaDescricao = lista[0];
        String modeloDescricao = lista[1];

        for (Produto p : loja) {
            if (p instanceof Telemovel) {
                Telemovel t = (Telemovel) p;
                if (t.getMarca().equalsIgnoreCase(marcaDescricao) &&
                    t.getModelo().equalsIgnoreCase(modeloDescricao)) {
                    return t.getClass().getSimpleName() + t;
                }
            }
        }
    }

    return "Produto não encontrado";
}


    public void listarProdutos() {

        for(Produto p : loja) {

            System.out.println(p);
        }
    }

    public void reorder() {

        Collections.sort(loja, new Comparator<Produto>() {
            
            public int compare(Produto p1, Produto p2) {
                
                return p1.getCodigo().compareTo(p2.getCodigo());
                
            }

            

            
        });

        for(Produto p : loja) {

                System.out.println(p);
            }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnderecoWeb(String endereco_web) {
        this.endereco_web = endereco_web;
    }

    public void setLoja(ArrayList<Produto> loja) {
        this.loja = loja;
    }

    
    

    

    
    

}
