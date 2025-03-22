package Learning2;

public class Main {

    public static void main(String[] args) {
        //criar 2 clintes, com o construtor como molde
        Cliente cliente1 = new Cliente("João", 969575205);
        Cliente cliente2 = new Cliente("Luís", 969933111);


        // criar 2 carros, com o construtor como molde
        Carro carro1 = new Carro("Toyota", "Corolla", 15000);
        Carro carro2 = new Carro("Honda", "Civic", 18000);

        //o cliente compra o carro
        cliente1.comprarCarro(carro1);
        cliente2.comprarCarro(carro2);

        //mostra o array do cliente
        cliente1.mostrarHistorico();
        cliente2.mostrarHistorico();
    }
    
}
