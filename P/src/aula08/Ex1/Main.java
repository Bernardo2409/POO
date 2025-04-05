package aula08.Ex1;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Empresa empresa1 = new Empresa("Empresa1", "1234-567", "empresa1@gmail.com");

        Motociclo mota1 = new Motociclo("AB-CD-12", "Kawasaki", "2", 40, "desportivo");
        Taxi taxi1 = new Taxi("AC-DB-22", "peugeot", "2008", 50, 1, 4, 50);
        AutomovelEletrico carroEletrico = new AutomovelEletrico("EL-00-01", "Tesla", "Model 3", 200, 500, 35);
        empresa1.adicionarVeiculo(carroEletrico);


        mota1.trajeto(30);
        taxi1.trajeto(50);

        empresa1.adicionarVeiculo(mota1);
        empresa1.adicionarVeiculo(taxi1);

        empresa1.listarVeiculos();

        System.out.println(empresa1.veiculo_menos_km());

        Telemovel tele1 = new Telemovel("912345678", 30);
        Atleta atleta = new Atleta("João", tele1);
        atleta.trajeto(2700); 


        ArrayList<IGestaoBateria> dispositivosComBateria = new ArrayList<>();
        dispositivosComBateria.add(carroEletrico);
        dispositivosComBateria.add(tele1);


        System.out.println("\nCargas disponíveis:");
        for (IGestaoBateria dispositivo : dispositivosComBateria) {
            System.out.println(dispositivo + "Carga: " + dispositivo.cargaDisponivel() + "%");
        }

        for (IGestaoBateria dispositivo : dispositivosComBateria) {
            dispositivo.limitarCargaMaxima(80.0);
        }

        for (IGestaoBateria dispositivo : dispositivosComBateria) {
            if (dispositivo.cargaDisponivel() < 40.0) {
                dispositivo.carregar(20.0); 
            }
        }

        System.out.println("\nCargas após controlo:");
        for (IGestaoBateria dispositivo : dispositivosComBateria) {
            System.out.println(dispositivo + "Carga: " + dispositivo.cargaDisponivel() + "%");
        }
    }
}
