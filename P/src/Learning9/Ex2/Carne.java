package Learning9.Ex2;

public class Carne extends Alimento {

    private Ementa.VariedadeCarne VariedadeCarne;

    public Carne(Ementa.VariedadeCarne VariedadeCarne, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.VariedadeCarne = VariedadeCarne;
    }

    
    
    @Override
    public String toString() {
        return "Carne " + VariedadeCarne + ", Proteinas " + getProteinas() + ", calorias " + getCalorias() + ", Peso " + getPeso();
    }



    
}
