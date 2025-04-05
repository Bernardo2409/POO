package aula08.Ex1;

public class Telemovel implements IGestaoBateria {

    private String numero;
    private double carga;
    private double limiteCargaMax = 100.0;

    public Telemovel(String numero, double cargaInicial) {
        this.numero = numero;
        this.carga = Math.min(cargaInicial, limiteCargaMax);
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

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Telemóvel " + numero + ", carga=" + carga + "%";
    }

}
