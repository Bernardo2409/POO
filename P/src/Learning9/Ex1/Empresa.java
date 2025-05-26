package Learning9.Ex1;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Veiculo> garagem;
    private String nome;
    private String codigo_postal;
    private String email;


    public Empresa(String nome, String codigo_postal, String email) {

        this.garagem = new ArrayList<>();
        this.nome = nome;
        this.codigo_postal = codigo_postal;
        if (!email.matches("^[a-zA-Z0-9]{3,}@.+\\.com$")) {
            throw new IllegalArgumentException("Email inválido! Deve ter pelo menos 3 letras/números antes do '@' e terminar em '.com'");
        }
        this.email = email;
    }


    
}
