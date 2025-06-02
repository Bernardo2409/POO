package Exame19_20.Ex1;

public class Produto {
    
    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", quantidade=" + quantidade + ", preco_base=" + preco_base + "]";
    }

    private String codigo;
    public int quantidade = 0;
    private double preco_base;

    public Produto(String codigo, int quantidade, double preco_base) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco_base = preco_base;
    }

    public Produto(double preco_base) {
        
        this.preco_base = preco_base;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_base() {
        return preco_base;
    }

    public void setPreco_base(double preco_base) {
        this.preco_base = preco_base;
    }

    public String getDescricao() {

        return "";
    }
}
