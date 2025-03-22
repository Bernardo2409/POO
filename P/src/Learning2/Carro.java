package Learning2;

public class Carro {

    // variáveis do carro
    private String marca;
    private String modelo;
    private int preco;


    // construtor do carro
    public Carro(String marca, String modelo, int preco) {

        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        
    }

    //return do preço para a outra classe
    public double getPreco() {
        return preco;
    }




    // quando der print é só meter o nome da classe
    @Override
    public String toString() {
        return marca + " " + modelo + " - " + preco + " euros";
    }

}
