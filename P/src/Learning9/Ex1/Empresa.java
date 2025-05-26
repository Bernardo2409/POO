package Learning9.Ex1;

import java.util.ArrayList;
import java.util.HashMap;

public class Empresa{

    private HashMap<Veiculo, Integer> garagem;
    private String nome;
    private String codigo_postal;
    private String email;


    public Empresa(String nome, String codigo_postal, String email) {

        this.garagem = new HashMap<>();
        this.nome = nome;
        this.codigo_postal = codigo_postal;
        if (!email.matches("^[a-zA-Z0-9]{3,}@.+\\.com$")) {
            throw new IllegalArgumentException("Email inválido! Deve ter pelo menos 3 letras/números antes do '@' e terminar em '.com'");
        }
        this.email = email;
    }

    public void addVeiculo(Veiculo v) {

        garagem.put(v, 0);

    }


    public void listarVeiculos() {

        for (Veiculo veiculo : garagem.keySet()) {

            System.out.println(veiculo);
        } 

    }

    public Veiculo maisquilometros() {
    Veiculo veiculoMax = null;
    int maxKm = -1;

    for (Veiculo v : garagem.keySet()) {
        int km = v.distanciaTotal(); 
        if (km > maxKm) {
            maxKm = km;
            veiculoMax = v;
        }
    }
    return veiculoMax;  
    }

     
    

    
}
