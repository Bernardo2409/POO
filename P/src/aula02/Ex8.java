package aula02;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int a = sc.nextInt();
        System.out.println("Digite outro número: ");
        int b = sc.nextInt();

        System.out.println("Qual operação queres fazer ? Soma-Subtração-Multiplicação-Divisão");
        String operação = sc.next();

        if(operação.equals("Soma")) {
            System.out.println("Resultado da soma entre " + a + " e " + b +" é : " + Soma(a,b));
        } else if (operação.equalsIgnoreCase("Subtracao")) {
            System.out.println("Resultado da subtração entre " + a + " e " + b + " é : " + Subtração(a,b));
        } else if (operação.equals("Multiplicacao")) {
            System.out.println("Resultado da multiplicação entre " + a + " e " + b + " é : " + Multiplicação(a, b));
        } else if (operação.equals("Divisao")) {
            System.out.println("Resultado da divisão entre " + a + " e " + b + " é : " + Divisão(a, b));
        } else {
            System.out.println("Insere uma numenclatura válida");
        }

        sc.close();
    }

    public static int Soma(int a , int b) {
        int soma = a + b;

        return soma;
    }

    public static int Subtração(int a, int b) {
        int subtração = a - b;

        return subtração;
    }

    public static int Multiplicação(int a, int b) {
        int multiplicacao = a * b;

        return multiplicacao;
    }

    public static int Divisão(int a, int b) {
        int divisao = a / b;

        return divisao;
    }


}
