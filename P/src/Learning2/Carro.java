package Learning2;

public class Carro {

    private String marca;
    private String modelo;
    private int preco;

    public Carro(String marca, String modelo, int preco) {

        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        
    }

    public double getPreco() {
        return preco;
    }





    @Override
    public String toString() {
        return marca + " " + modelo + " - " + preco + " euros";
    }

}
