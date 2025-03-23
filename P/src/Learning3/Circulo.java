package Learning3;

public class Circulo {

    private int raio;



    public Circulo(int raio) {
        if(raio < 0) {
            throw new IllegalArgumentException("O raio deve ser maior que 0.");
        }
        this.raio = raio;

    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getPerimetro() {

        return Math.PI * raio * 2;

    }

    @Override
    public String toString() {

        return String.format("Circulo: área: %.2f, perímetro: %.2f", getArea(), getPerimetro());

    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circulo other = (Circulo) obj;
        return this.raio == other.raio;
    }

}
