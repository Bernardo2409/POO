package Learning9.Ex1;

public class Automovel_Ligeiro extends Veiculo {

    private int numero_quadro;
    private int capacidade_bagageira;

    public Automovel_Ligeiro(String matricula, String marca, String modelo, int potencia, int numero_quadro, int capacidade_bagageira) {
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.capacidade_bagageira = capacidade_bagageira;
    }
}
