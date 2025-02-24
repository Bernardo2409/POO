package aula03;
import java.util.Scanner;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int adivinha = random.nextInt(100) +1;
        
        
        System.out.println("Adivinha o número: ");
            int numero;
            String variacao = ""; 

        do{ 

            numero = sc.nextInt();

            if(numero < adivinha) { 
                variacao = "é maior";
            }
            else if( numero > adivinha) {
                variacao = "é menor";
            }
            else {
                variacao =  numero + " está correto, Parabéns!";
            }

            System.out.println("O número " + variacao);

        } while (numero != adivinha);


        sc.close();

    }

}
