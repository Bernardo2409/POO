package Learning9.Ex2;

public class Peixe extends Alimento{

    private Ementa.TipoPeixe Variedade;

    public Peixe(Ementa.TipoPeixe variedade, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        Variedade = variedade;
    }

    @Override
    public String toString() {
        return "Peixe " + Variedade + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() + ", Peso " + getPeso();
    }

    
}
