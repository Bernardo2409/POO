package aula04.PDS;

public class Retangulo {
    private double comprimento;
    private double altura;

    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return comprimento * altura;
    }

    public double perimetro() {
        return 2 * (comprimento + altura);
    }

    public String toString() {
        return "Retângulo - Comprimento: " + comprimento + ", Altura: " + altura + ", Área: " + area() + ", Perímetro: " + perimetro();
    }

    public boolean equals(Retangulo retangulo) {
        return this.comprimento == retangulo.comprimento &&
               this.altura == retangulo.altura;
    }
}
