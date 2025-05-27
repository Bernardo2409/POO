package Learning9.Ex3;

public class ProdutoComDesconto extends ProdutoGenerico{

    private int desconto;

    public ProdutoComDesconto(String nome, int stock, double preco, int desconto) {
        super(nome, stock, preco);

        this.desconto = desconto / 100;
    }

    public double getPreco() {
        
        return preco - (preco * desconto);

    }



}
