package aula02;
import java.util.Scanner;


public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreve uma frase");
        String frase = sc.nextLine();
        StringBuilder resultado = new StringBuilder();
        
        int i = 0;
        while (i < frase.length()) {
            char c = frase.charAt(i);
            if (Character.isUpperCase(c)) {
                resultado.append(c);
            }
            i++;
        }

        System.out.println("Acronimo: " + resultado.toString());
        sc.close();
    }
}
