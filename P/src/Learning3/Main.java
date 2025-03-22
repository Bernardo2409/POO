package Learning3;

public class Main {
        
    public static void main(String[] args) {
        try {
        Circulo circulo1 = new Circulo(4);
        Circulo circulo2 = new Circulo(4);

        Triangulo triangulo1 = new Triangulo(0, 4,5);
        Triangulo triangulo2 = new Triangulo(4, 5,3);

        Retangulo retangulo1 = new Retangulo(4, 5);
        Retangulo retangulo2 = new Retangulo(5, 4);
        
        System.out.println(triangulo1);
        System.out.println(circulo1);
        System.out.println(retangulo1);

        System.out.println(circulo1.equals(circulo2));
        System.out.println(triangulo1.equals(triangulo2));
        System.out.println(retangulo1.equals(retangulo2));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
