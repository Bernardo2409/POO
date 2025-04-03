package aula08.Ex1;

public class Atleta implements IKmPercorridos {
    
    private int km_totais;
    private int ultimo_km;

    public Atleta() {
        this.km_totais = 0;
        this.ultimo_km = 0;
    }

    public void trajeto(int quilometros) {
        this.ultimo_km = quilometros;
        this.km_totais += quilometros;
    }

    public int ultimoTrajeto() {
        return this.ultimo_km;
    }

    public int distanciaTotal() {
        return this.km_totais;
    }

}
