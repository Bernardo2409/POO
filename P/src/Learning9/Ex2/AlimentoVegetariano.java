package Learning9.Ex2;

public class AlimentoVegetariano extends Alimento {

    private String nome;

    public AlimentoVegetariano(double proteinas, double calorias, double peso, String nome) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

   
}
