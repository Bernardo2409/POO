package aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String string = sc.nextLine();

        int algarismos = countDigits(string);
        int spaces = countSpaces(string);
        String nospaces = removeSpaces(string);
        Boolean palidromo = palindromo(string);

        System.out.println("A frase tem " + algarismos + " algarismos.");
        System.out.println("A frase tem " + spaces + " espaços.");
        System.out.println("Frase sem espaços é: " + nospaces);
        System.out.println("Palíndromo? " + palidromo);

        sc.close();

    }

    public static int countDigits(String s) {
        int counter = 0;
        for (char i : s.toCharArray()) {
            if (Character.isDigit(i)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countSpaces(String s) {
        int counter = 0;
        for (char i: s.toCharArray()){
            if (Character.isWhitespace(i)) {
                counter++;
            }

        }
        return counter;
    }
    
    public static String removeSpaces(String s) {
        String string = s.replaceAll("\\s+", " ");

        return string;
    }

    public static boolean palindromo(String s) {
        String reverse = new StringBuilder(s).reverse().toString();

        if (reverse.equals(s)) {return true;}

        return false;

    }
    

    
}
