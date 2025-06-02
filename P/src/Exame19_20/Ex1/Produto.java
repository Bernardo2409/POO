package Exame19_20.Ex1;

public abstract class Produto {
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + quantidade;
        long temp;
        temp = Double.doubleToLongBits(preco_base);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (quantidade != other.quantidade)
            return false;
        if (Double.doubleToLongBits(preco_base) != Double.doubleToLongBits(other.preco_base))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", quantidade=" + quantidade + ", preco_base=" + preco_base + "]";
    }

    private String codigo;
    private String titulo;
    public int quantidade = 1;
    private double preco_base;
    private static int proximocodigo = 998;

    public Produto(String titulo, int quantidade, double preco_base, char prefixo) {

        this.codigo = prefixo + String.valueOf(proximocodigo++);
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.preco_base = preco_base;
    }

    public Produto(double preco_base, char prefixo) {
        
        this.preco_base = preco_base;
        this.codigo = prefixo + String.valueOf(proximocodigo = proximocodigo +2);
    }

    public String getTitulo() {

        return titulo;
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

    public void addStock(int stock) {

        quantidade += stock;
    }

    public int getStock() {

        return quantidade;
    }

    public boolean vender(int numero) {

        if ( quantidade < numero) {

            return false;
        }else {
            quantidade -= numero;
            return true;
        }

    }

    public String getCodigo() {

        return this.codigo;
    }

    
}
