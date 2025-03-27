package aula07.Ex3;

abstract class Obra {

    //variáveis
    protected String titulo;
    protected String autor;
    protected int preco;
    protected int id;
    protected static int nextId = 33;

    //construtor
    public Obra(String titulo, String autor, int preco) {

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
        if (preco > 0) {}
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    


}

class Quadro extends Obra {

    private String tinta;
    private char emoldurado;
    private String tamanho;

    public Quadro(String titulo,String autor,int preco,String tinta, char emoldurado, String tamanho) {
        super(titulo, autor, preco);
        this.tinta = tinta;
        this.emoldurado = emoldurado;
        this.tamanho = tamanho;

    }

    @Override
    public String toString() {
        return "Foi adicionado a obra: " + titulo + ", autor: " + autor + ", tinta: " + tinta + ", emoldurado: " + emoldurado + ", tamanho: " + tamanho;
    }
    
}
class Escultura extends Obra {

    private String material;
    private int exemplares;

    public Escultura(String titulo, String autor, int preco, int id, String material, int exemplares) {
        super(titulo, autor, preco);

        this.material = material;
        this.exemplares = exemplares;

    }

}
class ObraDigital extends Obra {

    private String blockchain;
    private String endereco;

    public ObraDigital(String titulo, String autor, int preco, int id, String blockchain, String endereco) {
        super(titulo, autor, preco);

        this.blockchain = blockchain;
        this.endereco = endereco;


    }
}
