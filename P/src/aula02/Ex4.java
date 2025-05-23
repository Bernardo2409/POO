
package aula02;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<Double>();

        double numero;

        System.out.print("Insere números: ");
        numero = sc.nextDouble();
        lista.add(numero);

        double primeiroNumero = numero;

        do {
            System.out.print("Insere números: ");
            numero = sc.nextDouble(); 
            lista.add(numero);
        } while (numero != primeiroNumero);


        System.out.println(lista);
        System.out.println("O valor máximo da lista é " + Collections.max(lista));
        System.out.println("O valor mínimo da lista é " + Collections.min(lista));

        int sum = 0;
        for (double num : lista) {
            sum += num;
        }

        System.out.println("A soma dos elementos da lista é "+sum);
        System.out.println("o tamanho da lista é "+lista.size());


        sc.close();
    }
}
