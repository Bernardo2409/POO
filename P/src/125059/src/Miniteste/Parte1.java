package Miniteste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Parte1 {
    // -----------------------------------------------------
    //          !!! Não alterar este código !!!
    // -----------------------------------------------------
    private static int v1;
    private static List<Integer> v2 = new ArrayList<>();
    private static String v3;
    private static List<String> v4 = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    // -----------------------------------------------------

    // -----------------------------------------------------------
    // >> Pode acrescentar novos métodos aqui (não é obrigatório)
    // -----------------------------------------------------------

    // pex., public static void ler(SOURCE) {}

    // -----------------------------------------------------------

    public static void lerTeclado() {
        // pex., ler(teclado); -ou- o que lhe for mais conveniente
        System.out.println("v1?");
        v1 = sc.nextInt();
        sc.nextLine();

        System.out.println("v2?");
        String[] numeros = sc.nextLine().split(" ");
        for (String i : numeros) {
            v2.add(Integer.parseInt(i));
        }

        System.out.println("v3?");
        v3 = sc.nextLine();

        System.out.println("v4?");
        String[] strings = sc.nextLine().split(" ");
        for (String j : strings) {
            v4.add(j);
        }
    }

    public static void lerFicheiro() {

        //try-catch para verificar se o ficheiro existe
       try {
            Scanner fileScanner = new Scanner(new File("\\UA\\1ano\\2 semestre\\POO\\P\\src\\125059 P6 Bernardo Coelho\\src\\Miniteste\\inputs.txt"));

            v1 = Integer.parseInt(fileScanner.nextLine());

            String[] numeros = fileScanner.nextLine().split(" ");
            for (String i : numeros) {
                v2.add(Integer.parseInt(i));
            }

            v3 = fileScanner.nextLine();

            String[] strings = fileScanner.nextLine().split(" ");
            for (String j : strings) {
                v4.add(j);
            }

            fileScanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Erro");
        }
    }
    

    public static void imprimir() {
        System.out.println(v1);
        System.out.println(v2.toString().replace("[", "").replace("]", "").replace(",", ""));
        System.out.println(v3);
        System.out.println(String.join(" ", v4));
    }

    public static void main(String[] args) {
        // -----------------------------------------------------------------
        // !!! Não imprimir texto a pedir determinado input, ler direto !!!
        // -----------------------------------------------------------------

        // pode editar livremente este código
        // lerTeclado();
        lerFicheiro();
        imprimir();
    }
}
