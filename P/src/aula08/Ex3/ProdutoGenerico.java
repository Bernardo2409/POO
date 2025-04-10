package aula08.Ex3;

public class ProdutoGenerico implements iProduto {
    
    private String nome;
    private int stock = 0;
    private int preco;



    public ProdutoGenerico(String nome, int stock, int preco) {
        this.nome = nome;
        this.stock = stock;
        this.preco = preco;
    }


    @Override
    public String getNome() {

        return nome;
    }


    @Override
    public void adicionarQuantidade(int quantidade) {
        
        stock += quantidade;
    }


    @Override
    public double getPreco() {
       return preco;
    }


    @Override
    public int getQuantidade() {
        return stock;
    }


    @Override
    public void removerQuantidade(int quantidade) {
        if(quantidade <= stock) {

            stock-=quantidade;
        }
        
    }

}

class ProdutoComDesconto extends ProdutoGenerico{

    private double desconto;

    public ProdutoComDesconto(String nome, int stock, int preco, double desconto) {
        super(nome, stock, preco);
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return super.getPreco() * (1 - desconto / 100);
    }

   

}
