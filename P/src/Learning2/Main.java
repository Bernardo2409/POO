package Learning2;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", 969575205);
        Cliente cliente2 = new Cliente("Luís", 969933111);
        Carro carro1 = new Carro("Toyota", "Corolla", 15000);
        Carro carro2 = new Carro("Honda", "Civic", 18000);

        cliente1.comprarCarro(carro1);
        cliente2.comprarCarro(carro2);

        cliente1.mostrarHistorico();
        cliente2.mostrarHistorico();
    }
    
}
