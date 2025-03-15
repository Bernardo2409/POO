package aula03;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int adivinha = (int) (100 * Math.random()) +1;
        
        
        System.out.println("Adivinha o número: ");
            int numero;
            String variacao = ""; 

        do{ 

            numero = sc.nextInt();

            if(numero < adivinha) { 
                variacao = "é Maior!";
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
