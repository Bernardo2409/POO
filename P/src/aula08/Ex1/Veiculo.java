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

    private int numero_quadro;
    private int capacidade_bagageira;

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






//continuar com os extends
