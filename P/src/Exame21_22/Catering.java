package Exame21_22;

public class Catering extends Activity {

    private int preco_por_participante = 25;
    private Option option;

    public Catering(Option option, int numero_participantes) {
        super(numero_participantes);
        this.option = option;
    }

    public enum Option{
        FULL_MENU,
        DRINKS_AND_SNACKS,
        LIGHT_BITES

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
