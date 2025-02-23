package aula02;
import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite algo");
        String string = sc.nextLine();
        System.out.println("A strig em letras minúsuculas é: "+ string.toLowerCase());
        System.out.println("As 3 primeiras letras são: "+ string.substring(0,3));
        System.out.println("Concatenar a string: "+ string.concat(".")); //Coloca um ponto final no final de casa frase

        sc.close();


    }
}
