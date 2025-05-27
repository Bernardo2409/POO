package Learning9.Ex2;

public class Legume extends AlimentoVegetariano{

    public Legume(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso, nome);
    }



    @Override
    public String toString() {
        return "Legume " + getNome() + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() + ", Peso " + getPeso();
    }
}
