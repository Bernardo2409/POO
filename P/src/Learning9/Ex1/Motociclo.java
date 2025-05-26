package Learning9.Ex1;

public class Motociclo extends Veiculo{

    private enum Tipo {
        DESPORTIVO,
        ESTRADA,
    }
    private Tipo tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, Tipo tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    }


}
