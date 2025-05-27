package Learning9.Ex2;

public class Cereal extends AlimentoVegetariano{

    public Cereal(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso, nome);
    
    }

    @Override
    public String toString() {
        return "Cereal " + getNome() + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() + ", Peso " + getPeso();
    }


}
