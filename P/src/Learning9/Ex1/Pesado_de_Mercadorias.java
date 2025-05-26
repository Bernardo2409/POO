package Learning9.Ex1;

public class Pesado_de_Mercadorias extends Veiculo{

    private int numero_quadro;
    private int peso;
    private int carga_maxima;

    
    public Pesado_de_Mercadorias(String matricula, String marca, String modelo, int potencia, int numero_quadro,
            int peso, int carga_maxima) {
        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.peso = peso;
        this.carga_maxima = carga_maxima;
    }
}
