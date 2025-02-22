package aula03;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere um número: ");
        int numero = 0;

        while (true) {
            System.out.println("Insere um número inteiro positivo maior que 1: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 1) {
                    break;
                } else {
                    System.out.println("Número inválido. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.next(); // Limpar a entrada inválida
            }
        }

        ArrayList<Integer> lista = new ArrayList<Integer>();


        for (int i = 1; i < numero; i++) {
            if (isPrime(i)) {
                lista.add(i);
                soma += i;
                System.out.printf("%d ", i);
            }
        }

        System.out.println("\nA soma dos números primos é: " + soma);

        sc.close();
    }

    public static boolean isPrime(int number) {
        int counter = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                counter++; 
            }

        }
        if (counter == 1) {
            return true;

        }
        return false;
    }
}
