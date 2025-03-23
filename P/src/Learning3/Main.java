package Learning3;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> figuras = new ArrayList<>();

        int opcao;
        System.out.println("Criar circulo");
        System.out.println("Criar Triangulo");
        System.out.println("Criar Retângulo");
        System.out.println("Listar figuras");
        System.out.println("Opção?");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Criar Círculo");
                System.out.println("Raio?");
                int raio = sc.nextInt();
                try {
                    figuras.add(new Circulo(raio));
                    System.out.println("Foi criado um novo Círculo de raio: " + raio );
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 2:
                System.out.println("Criar Triangulo");
                System.out.println("Lado1");
                int lado1 = sc.nextInt();
                System.out.println("Lado2");
                int lado2 = sc.nextInt();
                System.out.println("lado3");
                int lado3 = sc.nextInt();
                try {
                    figuras.add(new Triangulo(lado1, lado2, lado3));
                    System.out.println("Foi criado um novo Triangulo com sucesso");
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 3:
                System.out.println("Criar Retângulo");
                System.out.println("Comprimento");
                int comprimento = sc.nextInt();
                System.out.println("Altura");
                int altura = sc.nextInt();
                try {
                    figuras.add(new Retangulo(comprimento, altura));
                    System.out.println("Foi criado um novo Retângulo com sucesso");
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 4:
                for (Object figura: figuras) {
                    System.out.println(figura);
                }
                break;
            case 5:
                for (int i = 0; i < figuras.size(); i++) { //percorre a lista
                    for (int j = i + 1; j < figuras.size(); j++) {
                        if (figuras.get(i).getClass() == figuras.get(j).getClass()) {
                            System.out.println(figuras.get(i) + " é igual a " + figuras.get(j) + "? " + figuras.get(i).equals(figuras.get(j)));
                        }
                    }
                }
                break;
            default:
                break;
        } while( opcao != 0);

        sc.close();
    }

}
