package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList(
            "banana", "kiwi", "abacate", "laranja", "figo", "uva"
        );

        System.out.println("Original:");
        palavras.forEach(System.out::println); // Method reference

        // Ordenar alfabeticamente (natural)
        Collections.sort(palavras);
        System.out.println("\nOrdenadas alfabeticamente:");
        palavras.forEach(System.out::println); // Method reference

        // Ordenar por comprimento usando method reference
        palavras.sort(Comparator.comparing(String::length));
        System.out.println("\nOrdenadas por comprimento:");
        palavras.forEach(System.out::println); // Method reference

        // Ordenar por ordem inversa (ainda usando comparator mas sem lambda)
        palavras.sort(Comparator.reverseOrder());
        System.out.println("\nOrdenadas inversamente:");
        palavras.forEach(System.out::println); // Method reference
    }
}
