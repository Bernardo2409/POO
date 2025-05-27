package Learning9.Ex3;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras implements Compra{

    private Map<Produto, Integer> carrinho;

    public CarrinhoDeCompras() {

        carrinho = new HashMap<>();
    }

    public void adicionarProduto (Produto produto, int quantidade) {

        carrinho.put(produto ,quantidade);
    }

    public void listarProdutos() {
        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }
    }

    public double calcularTotal() {

        double preco = 0;
        double total = 0;

        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {

            preco = entry.getKey().getPreco() * entry.getKey().getQuantidade();
            total += preco;
        }

        return total;
    }




}
