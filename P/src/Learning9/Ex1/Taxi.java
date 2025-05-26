package Learning9.Ex1;

public class Taxi extends Automovel_Ligeiro{

    private int nmr_licenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, int numero_quadro,
            int capacidade_bagageira, int nmr_licenca) {
        super(matricula, marca, modelo, potencia, numero_quadro, capacidade_bagageira);
        this.nmr_licenca = nmr_licenca;
    }
}
