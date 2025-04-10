package Learning5;


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


    public abstract String detalhes();

    public String getTitulo() {
        return titulo;
    }

    public int getPreco() {
        return preco;
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
    public String detalhes() {
        return getId() + "Quadro: " + titulo + ", autor: " + autor + ", tinta: " + tinta + ", emoldurado: " + emoldurado + ", tamanho: " + tamanho;
    }

    @Override
    public String toString() {

        return titulo;
    }
    
}
class Escultura extends Obra {

    private String material;
    private int exemplares;

    public Escultura(String titulo, String autor, int preco, String material, int exemplares) {
        super(titulo, autor, preco);

        this.material = material;
        this.exemplares = exemplares;

    }
    @Override
    public String detalhes() {
        return "Escultura: " + titulo + ", autor: " + autor + ", material: " + material + ", exemplares: " + exemplares;
    }

    @Override 
    public String toString() {

        return titulo;
    }

}
class ObraDigital extends Obra {

    private String blockchain;
    private String endereco;

    public ObraDigital(String titulo, String autor, int preco, String blockchain, String endereco) {
        super(titulo, autor, preco);

        this.blockchain = blockchain;
        this.endereco = endereco;


    }

    @Override
    public String detalhes() {
        return "ObraDigital: " + titulo + ", autor: " + autor + ", blockchain: " + blockchain + ", endereço: " + endereco;
    }
    @Override
    public String toString() {

        return titulo;
    }
}

