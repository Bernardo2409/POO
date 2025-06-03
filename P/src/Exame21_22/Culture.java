package Exame21_22;

public class Culture extends Activity {

    private int max_participantes = 15;
    private int preco_por_participante = 22;    
    private Option option;

    public Culture( Option option,int numero_participantes) {
        super(numero_participantes);
        this.option = option;
    }

    public enum Option{

        ARCHITECTURAL_TOUR,
        RIVER_TOUR,
        ART_MUSEUM,
        WINE_TASTING
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

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

}
