package aula03;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("D:\\UA\\1ano\\2 semestre\\POO\\P\\src\\aula03/words.txt"));
        List<String> words = new ArrayList<>();
        List<String> wordsEndingInS = new ArrayList<>();

        while (input.hasNext()) {
            String word = input.next();
            if (word.length() > 2 && word.matches("[a-zA-Z]+")) {
                words.add(word);
                if (word.endsWith("s")) {
                    wordsEndingInS.add(word);
                }
            }
        }
        input.close();

        // Print the words longer than 2 characters
        System.out.println("Words longer than 2 characters:");
        for (String word : words) {
            System.out.println(word);
        }

        // Print the words ending in 's'
        System.out.println("\nWords ending in 's':");
        for (String word : wordsEndingInS) {
            System.out.println(word);
        }
    }
}