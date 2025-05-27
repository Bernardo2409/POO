package Learning9.Ex3;

public class ProdutoGenerico implements Produto{

    private String nome;
    private int stock;
    public double preco;

    public ProdutoGenerico(String nome, int stock, double preco) {
        this.nome = nome;
        this.stock = stock;
        this.preco = preco;

    }

    public String getNome(){
        return nome;
    }

    public double getPreco() {

        return preco;

    }

    public int getQuantidade() {


        return stock;
    }

    public void adicionarQuantidade(int quantidade) {

        stock += quantidade;
    }

    public void removerQuantidade(int quantidade) {

        if (quantidade <= stock) {
            stock -= quantidade;
        } else {

            stock = 0;
        }

    }



}

