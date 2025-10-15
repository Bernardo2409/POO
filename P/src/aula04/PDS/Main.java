package aula04.PDS;

import java.util.ArrayList;
import java.util.Scanner;

import Learning3.Circulo;
import Learning3.Retangulo;
import Learning3.Triangulo;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> figuras = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Círculo");
            System.out.println("2. Adicionar Triângulo");
            System.out.println("3. Adicionar Retângulo");
            System.out.println("4. Listar Figuras");
            System.out.println("5. Comparar Figuras");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o raio do círculo: ");
                    double raio = sc.nextDouble();
                    if (raio > 0) {
                        figuras.add(new Circulo(raio));
                    } else {
                        System.out.println("O raio deve ser positivo.");
                    }
                    break;
                case 2:
                    System.out.print("Insira o lado 1 do triângulo: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Insira o lado 2 do triângulo: ");
                    double lado2 = sc.nextDouble();
                    System.out.print("Insira o lado 3 do triângulo: ");
                    double lado3 = sc.nextDouble();
                    // verificar Des. trian.
                    if (lado1 > 0 && lado2 > 0 && lado3 > 0 && lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                        figuras.add(new Triangulo(lado1, lado2, lado3));
                    } else {
                        System.out.println("Os lados devem ser positivos e obedecer à desigualdade triangular.");
                    }
                    break;
                case 3:
                    System.out.print("Insira o comprimento do retângulo: ");
                    double comprimento = sc.nextDouble();
                    System.out.print("Insira a altura do retângulo: ");
                    double altura = sc.nextDouble();
                    if (comprimento > 0 && altura > 0) {
                        figuras.add(new Retangulo(comprimento, altura));
                    } else {
                        System.out.println("O comprimento e a altura devem ser positivos.");
                    }
                    break;
                case 4:
                    for (Object figura : figuras) {
                        System.out.println(figura);
                    }
                    break;
                case 5:
                    for (int i = 0; i < figuras.size(); i++) {
                        for (int j = i + 1; j < figuras.size(); j++) {
                            if (figuras.get(i).getClass() == figuras.get(j).getClass()) {
                                System.out.println(figuras.get(i) + " é igual a " + figuras.get(j) + "? " + figuras.get(i).equals(figuras.get(j)));
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Bye :( ");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
