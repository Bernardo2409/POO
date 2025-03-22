package Learning3;

public class Retangulo {
    private int comprimento;
    private int altura;

    public Retangulo(int comprimento, int altura) {

        this.comprimento = comprimento;
        this.altura = altura;
    }
    public int getArea() {

        return comprimento * altura;
    }


    @Override
    public String toString() {

        return "Retângulo: área:"  + getArea();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Retangulo other = (Retangulo) obj;

        int[] ladosThis = {this.comprimento, this.altura};
        int[] ladosOther = {other.comprimento, other.altura};
        java.util.Arrays.sort(ladosThis);
        java.util.Arrays.sort(ladosOther);

        // Compara os lados ordenados
        return java.util.Arrays.equals(ladosThis, ladosOther);


    }
}
