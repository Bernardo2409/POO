package Exame21_22;

public class Sport extends Activity {

    private int max_participantes = 10;
    private int preco_por_participante = 30;
    private Modality modality;

    public enum Modality {
        KAYAK, BIKE
    }

    public Sport(Modality modality, int numero_participantes) {
        super(numero_participantes);
        this.modality = modality;
    }

    public int getMax_participantes() {
        return max_participantes;
    }

    public void setMax_participantes(int max_participantes) {
        this.max_participantes = max_participantes;
    }

    public int getPreco_por_participante() {
        return preco_por_participante;
    }

    public void setPreco_por_participante(int preco_por_participante) {
        this.preco_por_participante = preco_por_participante;
    }

    public Modality getModality() {
        return modality;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }
}
