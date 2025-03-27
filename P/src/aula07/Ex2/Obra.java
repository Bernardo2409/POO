package aula07.Ex2;

public class Obra {

    //variáveis
    private String titulo;
    private String autor;
    private int preco;
    private int id;
    private static int nextId = 33;

    //construtor
    public Obra(String titulo, String autor, int preco, int id) {

        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.id = nextId++;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}

class Quadro extends Obra {

    private String tinta;
    private boolean emoldurado;
    private String tamanho;

    public Quadro(String titulo,String autor,int preco, int id, String tinta, boolean emoldurado, String tamanho) {
        super(titulo, autor, preco, id);

        this.tinta = tinta;
        this.emoldurado = emoldurado;
        this.tamanho = tamanho;

    }
    
}
class Escultura extends Obra {

    private String material;
    private int quantidade;

    public Escultura(String titulo, String autor, int preco, int id, String material, int quantidade) {
        super(titulo, autor, preco, id);

        this.material = material;
        this.quantidade = quantidade;

    }

}
class ObraDigital extends Obra {

    private String blockchain;
    private String endereco;

    public ObraDigital(String titulo, String autor, int preco, int id, String blockchain, String endereco) {
        super(titulo, autor, preco, id);

        this.blockchain = blockchain;
        this.endereco = endereco;


    }
}
