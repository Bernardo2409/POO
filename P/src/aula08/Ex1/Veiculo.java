package aula08.Ex1;

public class Veiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int potencia;
    protected int km_totais;
    protected int ultimo_km;

    public Veiculo(String matricula, String marca, String modelo, int potencia) {

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.km_totais = 0;
        this.ultimo_km = 0;

    }

    public void trajeto(int quilometros) {

        this.km_totais += quilometros;
        this.ultimo_km = quilometros;
    }

    public int ultimoTrajeto() {

        return this.ultimo_km;
    }

    public int distanciaTotal() {

        return this.km_totais;
    }
    @Override
    public String toString() {
        return marca + " " + modelo + " " + matricula + " " + km_totais + " kms percorridos";
    }



}
class Motociclo extends Veiculo {

    private String tipo;

    public Motociclo( String matricula, String marca, String modelo, int potencia, String tipo){

        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;
    
    }


    // incompleto
    public void setTipo(String tipo) {
        if (tipo == null || tipo.isEmpty() || 
            (!tipo.equalsIgnoreCase("desportivo") && !tipo.equalsIgnoreCase("estrada"))) {
            this.tipo = "indefinido";
        } else {
            this.tipo = tipo;
        }
    }

    

}
class AutomovelLigeiro extends Veiculo {

    protected int numero_quadro;
    protected int capacidade_bagageira;

    public AutomovelLigeiro ( String matricula, String marca, String modelo, int potencia, int numero_quadro, int capacidade_bagageira) {

        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.capacidade_bagageira = capacidade_bagageira;


    }


}
class Taxi extends AutomovelLigeiro {

    private int licenca;

    public Taxi( String matricula, String marca, String modelo, int potencia, int numero_quadro, int capacidade_bagageira, int licenca) {

        super(matricula, marca, modelo, potencia, numero_quadro, capacidade_bagageira);
        this.licenca = licenca;
    }

    @Override
    public String toString() {

        return "Taxi: " + marca + " " + modelo;
    }
}

class PesadoMercadorias extends Veiculo {


    private int numero_quadro;
    private int peso;
    private int carga_maxima;

    public PesadoMercadorias ( String matricula, String marca, String modelo, int potencia, int numero_quadro, int peso, int carga_maxima ) {

        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.peso = peso;
        this.carga_maxima = carga_maxima;

    }
}

class PesadoPassageiros extends Veiculo {

    private int numero_quadro;
    private int peso;
    private int passageiros_maximo;

    public PesadoPassageiros( String matricula, String marca, String modelo, int potencia, int numero_quadro, int peso, int passageiros_maximo ) {

        super(matricula, marca, modelo, potencia);
        this.numero_quadro = numero_quadro;
        this.peso = peso;
        this.passageiros_maximo = passageiros_maximo;

    }

}

class AutomovelEletrico extends AutomovelLigeiro implements IGestaoBateria {

    private double carga;
    private double limiteCargaMax = 100.0;
    
    public AutomovelEletrico ( String matricula, String marca, String modelo, int potencia, int numero_quadro, int capacidade_bagageira) {

        super(matricula, marca, modelo, potencia, numero_quadro, capacidade_bagageira);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.numero_quadro = numero_quadro;
        this.capacidade_bagageira = capacidade_bagageira;
    

    }

    public double cargaDisponivel() {
        return carga;
    }

    public void carregar(double percentagem) {
        this.carga = Math.min(limiteCargaMax, this.carga + percentagem);
    }

    public void limitarCargaMaxima(double percentagem) {
        this.limiteCargaMax = percentagem;
        if (this.carga > limiteCargaMax) {
            this.carga = limiteCargaMax;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Elétrico, carga=" + carga + "%]";
    }

}






//continuar com os extends
