package Learning9.Ex1;


public class Main {
    public static void main(String[] args) {
        
        Empresa empresa1 = new Empresa("Empresa 1", "1234-123", "empresa1@gmail.com");

        
        Motociclo m1 = new Motociclo("AB-12-BC", "Yamaha", "TT", 200, Motociclo.Tipo.DESPORTIVO);
        
        Motociclo m2 = new Motociclo("DD-23-AA", "Honda", "mk", 40, Motociclo.Tipo.ESTRADA);

        empresa1.addVeiculo(m1);
        empresa1.addVeiculo(m2);

        empresa1.listarVeiculos();


        m2.trajeto(300);

        System.out.println(m1.distanciaTotal());
        System.out.println(m1.ultimoTrajeto());

        System.out.println(empresa1.maisquilometros());



        System.out.println("concluido");
    }
}
