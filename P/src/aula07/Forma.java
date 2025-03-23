package aula07;

public abstract class Forma {

    //variaveis
    private String cor;
    public abstract double perimetro();
    public abstract double area();

    // construtor
    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Forma forma = (Forma) obj;
        return cor.equals(forma.cor);
    }

    @Override
    public String toString() {
        return "Cor: " + cor;
    }
}

class Circulo extends Forma {
    
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Circulo circulo = (Circulo) obj;
        return Double.compare(circulo.raio, raio) == 0;
    }

    @Override
    public String toString() {
        return "Círculo [Raio: " + raio + ", " + super.toString() + "]";
    }
}

class Retangulo extends Forma {
    private double largura, altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Retangulo retangulo = (Retangulo) obj;
        return Double.compare(retangulo.largura, largura) == 0 && Double.compare(retangulo.altura, altura) == 0;
    }

    @Override
    public String toString() {
        return "Retângulo [Largura: " + largura + ", Altura: " + altura + ", " + super.toString() + "]";
    }
}

class Triangulo extends Forma {
    private double lado1, lado2, lado3;

    public Triangulo(String cor, double lado1, double lado2, double lado3) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Triangulo triangulo = (Triangulo) obj;
        return Double.compare(triangulo.lado1, lado1) == 0 &&
               Double.compare(triangulo.lado2, lado2) == 0 &&
               Double.compare(triangulo.lado3, lado3) == 0;
    }

    @Override
    public String toString() {
        return "Triângulo [Lados: " + lado1 + ", " + lado2 + ", " + lado3 + ", " + super.toString() + "]";
    }
}
