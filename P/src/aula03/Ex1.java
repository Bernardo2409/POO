package aula03;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insere um número: ");
        int numero = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<Integer>();


        for (int i = 1; i < numero; i++) {
            if (isPrime(i)) {
                lista.add(i);
            }

        }

        System.out.println(lista);

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
