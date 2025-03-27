package aula07.Ex1;

public class TesteFormas {
    public static void main(String[] args) {
        Forma c1 = new Circulo("Vermelho", 5);
        Forma r1 = new Retangulo("Azul", 4, 6);
        Forma t1 = new Triangulo("Verde", 3, 4, 5);

        System.out.println(c1);
        System.out.println("Área: " + c1.area() + ", Perímetro: " + c1.perimetro());
        
        System.out.println(r1);
        System.out.println("Área: " + r1.area() + ", Perímetro: " + r1.perimetro());
        
        System.out.println(t1);
        System.out.println("Área: " + t1.area() + ", Perímetro: " + t1.perimetro());
    }
}
