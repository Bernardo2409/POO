package aula03;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insere um número: ");
        int numero = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();


        for (int i = 1; i < numero; i++) {
            if (isPrime(i)) {
                lista.add(i);
            }

        }
        System.out.println("O número primos menores que o valor inserido são: ");
        for (int j = 0; j < lista.size(); j++) {
            System.out.printf("%d ", lista.get(j));
            soma += j;

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
