package Exame19_20.Ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Livro extends Produto {

    private String titulo;
    // private HashSet<Autor> autores;
    private List<Autor> autores;
    
    public Livro(String codigo, int quantidade, double preco_base, String titulo, HashSet<String> autores) {
        super(codigo, quantidade, preco_base, 'L');
        this.titulo = titulo;
        this.autores = new ArrayList<>();
    }

    public Livro(String titulo, double preco_base) {

        super(preco_base, 'L');
        this.titulo = titulo;
        this.autores = new ArrayList<>();

    }

    public Livro( String titulo, double preco_base, List<Autor> autores) {

        super(preco_base, 'L');
        this.titulo = titulo;
        this.autores = autores;
    }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public List<Autor> getLista() {


        return autores;
    }

    public void setStock(int stock) {

        quantidade = stock;
    }

    public List<Autor> autores() {


        return getLista();
    }

    public int numeroAutores() {

        int qua = 0;

        for (Autor a : autores) {
            qua += 1;

        }
        return qua;
    }

    public void add(Autor a) {

        autores.add(a);
    }


}
