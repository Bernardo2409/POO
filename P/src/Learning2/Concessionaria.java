package Learning2;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Concessionaria {
    class Venda {
        private Carro carro;
        private LocalDate data;
        private double preco;
    
        public Venda(Carro carro, double preco) {
            this.carro = carro;
            this.data = LocalDate.now(); 
            this.preco = preco;
        }
    
        @Override
        public String toString() {
            return data + " - " + carro + " - €" + preco;
        }
    }
    
    class Cliente {
        private String nome;
        private List<Venda> historicoCompras;
    
        public Cliente(String nome) {
            this.nome = nome;
            this.historicoCompras = new ArrayList<>();
        }
    
        public void comprarCarro(Carro carro) {
            Venda venda = new Venda(carro, carro.getPreco());
            historicoCompras.add(venda);
            System.out.println(nome + " comprou um carro: " + venda);
        }
    
        public void mostrarHistorico() {
            System.out.println("Histórico de compras de " + nome + ":");
            for (Venda v : historicoCompras) {
                System.out.println("- " + v);
            }
        }
    }
}
