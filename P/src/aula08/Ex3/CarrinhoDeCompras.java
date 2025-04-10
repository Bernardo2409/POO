package aula08.Ex3;

import java.util.ArrayList;

public class CarrinhoDeCompras implements iCompra {
    private ArrayList<iProduto> lista;

    
    public CarrinhoDeCompras() {
        lista = new ArrayList<>();
    }

    @Override
    public void adicionarProduto(iProduto produto, int quantidade) {
        if (produto.getQuantidade() < quantidade) {
            System.out.println("Quantidade indisponível para " + produto.getNome());
            
        }
        else {

        for (int i = 0; i < quantidade; i++) {
            lista.add(produto);
        }
        produto.removerQuantidade(quantidade);
        }
    }

    @Override
    public double calcularTotal() {

        double total = 0;
        for(iProduto produto : lista) {

            total += produto.getPreco();


        }
        return total;


    }
    

    @Override
    public void listarProdutos() {
       
        
    }

}
