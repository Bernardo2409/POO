package Learning5;

public class Obra {
    protected String titulo;
    protected String autor;
    protected double precobase;
    protected int id;
    protected static int nextId = 33;

    public Obra(String titulo, String autor, double precobase, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.precobase = precobase;
        this.id = id;
    }

}
class Quadro extends Obra {

    private String tinta;
    private boolean emoldurado;
    private String tamanho;

    public Quadro(String titulo, String autor, double precobase, int id, String tinta, boolean emoldurado,
            String tamanho) {
        super(titulo, autor, precobase, id);
        this.tinta = tinta;
        this.emoldurado = emoldurado;
        this.tamanho = tamanho;
    
    }
    

    

    


}
