
package aula02;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Segundos? ");
        int number = sc.nextInt();
        
        int seconds = (number % 60);
        int minutes = (number / 60) % 60 ;
        int hours = (number / 3600) ;
        
        System.out.println("O tempo em segundos de " + number + " corresponde a " + String.format("%02d", hours) + ":"
        + String.format("%02d", minutes) + ":"
        + String.format("%02d", seconds)
        );
        
        sc.close();
    }
}



