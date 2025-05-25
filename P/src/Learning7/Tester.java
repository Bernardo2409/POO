package Learning7;


public class Tester {

     public static void main(String[] args) {
        // Criar o gestor da frota
        GestorFrota gestor = new GestorFrota();

        // Criar veículos
        Veiculo scooter1 = new ScooterEletrica(); // ID gerado automaticamente (ex: V1)
        Veiculo scooter2 = new ScooterEletrica();
        Veiculo bicicleta1 = new Bicicleta();
        Veiculo bicicleta2 = new Bicicleta();

        // Adicionar à frota
        gestor.adicionarVeiculo(scooter1);
        gestor.adicionarVeiculo(scooter2);
        gestor.adicionarVeiculo(bicicleta1);
        gestor.adicionarVeiculo(bicicleta2);

        // Simular deslocações
        scooter1.mover(5);   // Scooter anda 5 km → consome bateria
        scooter2.mover(10);

        bicicleta1.mover(15); // Bicicleta anda 10 km → só aumenta km

        // Carregar uma scooter
        if (scooter1 instanceof IEletrico) {
            ((IEletrico) scooter1).carregar();
        }

        
        // Mostrar estatísticas da frota
        System.out.println("=== Estatísticas da Frota ===");
        gestor.mostrarEstatisticas();

        // Ver nível de bateria
        if (scooter1 instanceof IEletrico) {
            System.out.println("Bateria da " + scooter1.getId() + ": " + ((IEletrico) scooter1).getNivelBateria() + "%");
        }

        if (scooter2 instanceof IEletrico) {
            System.out.println("Bateria da " + scooter2.getId() + ": " + ((IEletrico) scooter2).getNivelBateria() + "%");
        }
    }
}
