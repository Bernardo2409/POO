package Learning3;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        if (!(lado1 > 0 && lado2 > 0 && lado3 > 0)) {
            throw new IllegalArgumentException("Lados do Triângulo têm de ser maior que 0");
        }
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getPerimetro() {

        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {

        return "Triângulo: perímetro: " + getPerimetro();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Triangulo other = (Triangulo) obj;
    // Ordena os lados dos dois triângulos
        int[] ladosThis = {this.lado1, this.lado2, this.lado3};
        int[] ladosOther = {other.lado1, other.lado2, other.lado3};
        java.util.Arrays.sort(ladosThis);
        java.util.Arrays.sort(ladosOther);

        // Compara os lados ordenados
        return java.util.Arrays.equals(ladosThis, ladosOther);
    }

}
