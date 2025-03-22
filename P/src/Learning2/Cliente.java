package Learning2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private int contacto;
    private List<Carro> historicoCompras;

    public Cliente(String nome, int contacto) {

        if (!isValidContacto(contacto)) {
            throw new IllegalArgumentException("Contacto inválido. Deve conter exatamente 9 dígitos.");
        }
        this.nome = nome;
        this.contacto = contacto;
        this.historicoCompras = new ArrayList<>();

    }

    private boolean isValidContacto (int contacto) {
        String contactoStr = String.valueOf(contacto);
        return contactoStr.matches("9\\d{8}"); 
    }

    public void setContacto(int contacto) {
        if (!isValidContacto(contacto)) {
            throw new IllegalArgumentException("Contacto inválido. Deve conter exatamente 9 dígitos.");
        }
        this.contacto = contacto;
    }

    public int getContacto() {
        return contacto;
    }


    public void comprarCarro(Carro carro) {
        historicoCompras.add(carro);
        System.out.println(nome + " comprou o carro: " + carro);
    }

    public void mostrarHistorico() {
        System.out.println("Histórico de compras de " + nome + ":");
        for (Carro c : historicoCompras) {
            System.out.println("- " + c);
        }
    }
    

    

}
