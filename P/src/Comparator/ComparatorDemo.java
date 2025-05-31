package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        String[] palavras = { "banana", "kiwi", "abacate", "laranja", "figo", "uva" };

        System.out.println("Original:");
        display(palavras);

        // 1. Ordenar por ordem alfabética (natural)
        Arrays.sort(palavras);
        System.out.println("\nOrdenadas alfabeticamente:");
        display(palavras);

        // 2. Ordenar por comprimento da palavra (usando lambda como Comparator)
        Arrays.sort(palavras, Comparator.comparing(s -> s.length()));
        System.out.println("\nOrdenadas por comprimento:");
        display(palavras);

        // 3. Ordenar por ordem alfabética inversa (com lambda)
        Arrays.sort(palavras, (a, b) -> b.compareTo(a));
        System.out.println("\nOrdenadas inversamente:");
        display(palavras);
    }

    // Método auxiliar para mostrar o array
    public static void display(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
