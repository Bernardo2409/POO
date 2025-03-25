package Learning4;

public class Banco {
    
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria("João", 500);



        conta1.consultarSaldo();
        System.out.println("O " + conta1.getOwner() + " tem " + conta1.consultarSaldo());
        conta1.depositar(500);
        conta1.consultarSaldo();
        conta1.levantar(300);
        conta1.consultarSaldo();
        System.out.println(conta1.consultarSaldo());

    }

}
