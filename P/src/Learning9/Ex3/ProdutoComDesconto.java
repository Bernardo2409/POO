package Learning9.Ex3;

public class ProdutoComDesconto extends ProdutoGenerico{

    private double desconto;

    public ProdutoComDesconto(String nome, int stock, double preco, double desconto) {
        super(nome, stock, preco);

        this.desconto = desconto / 100.0;
    }

    public double getDesconto() {

        return desconto / 100;
    }

    @Override
    public double getPreco() {
        
        return preco - (preco * desconto);

    }



}
