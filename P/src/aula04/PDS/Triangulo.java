package aula04.PDS;

public class Triangulo {

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double area() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    public String toString() {
        return "Triângulo - Lados: " + lado1 + ", " + lado2 + ", " + lado3 + ", Área: " + area() + ", Perímetro: " + perimetro();
    }

    public boolean equals(Triangulo triangulo) {
        return this.lado1 == triangulo.lado1 &&
               this.lado2 == triangulo.lado2 &&
               this.lado3 == triangulo.lado3;
    }
}
