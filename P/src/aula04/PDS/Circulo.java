package aula04.PDS;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public String toString() {
        return "Círculo - Raio: " + raio + ", Área: " + area() + ", Perímetro: " + perimetro();
    }

    public boolean equals(Circulo circulo) {
        return this.raio == circulo.raio;
    }
}
