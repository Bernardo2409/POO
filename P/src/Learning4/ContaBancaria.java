package Learning4;

public class ContaBancaria {
    
    private String owner;
    private int money;


    public ContaBancaria(String owner, int money) {

        this.owner = owner;
        this.money = money;
    }

    public String getOwner() {

        return owner;
    }

    public void depositar(int transf) {

        money += transf;

    }   

    public void levantar(int transf) {
    
    if (transf > money) {
        System.out.println("Valor inválido");
    } else {

        money -= transf;
    }

    }

    public int consultarSaldo() {

        return money;

    }

}


