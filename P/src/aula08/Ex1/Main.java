package aula08.Ex1;

public class Main {
    
    public static void main(String[] args) {
        
        Empresa empresa1 = new Empresa("Empresa1", "1234-567", "empresa1@gmail.com");

        Motociclo mota1 = new Motociclo("AB-CD-12", "Kawasaki", "2", 40, "desportivo");
        Taxi taxi1 = new Taxi("AC-DB-22", "peugeot", "2008", 50, 1, 4, 50);
        mota1.trajeto(30);

        empresa1.adicionarVeiculo(mota1);
        empresa1.adicionarVeiculo(taxi1);

        empresa1.listarVeiculos();





    }
}
