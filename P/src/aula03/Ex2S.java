package aula03;
import java.util.Scanner;

public class Ex2S {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int adivinha = (int) (100 * Math.random()) +1;
        int tentativas = 0;
        int acertar;
        int computador = 0;
        
        //Computador Metodo Random
        /* 
        do{
            acertar = (int) (100 * Math.random()) +1;
            computador += 1;
        }while (acertar != adivinha); 
        */

        //Computador Metodo Metades
        acertar = 50;
        int menor = 0;
        int maior = 100;
        do {
            if (acertar < adivinha) {
                menor = acertar;
                acertar = (acertar + maior) / 2;
            } else if (acertar > adivinha) {
                maior = acertar;
                acertar = (acertar + menor) / 2;
            }
            computador += 1;
            
        } while(acertar != adivinha);
        //0-100 50 - 75 // 50-63

        //Utilizador
        
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
                variacao =  numero + " está correto, Parabéns! Acertaste em " + tentativas + " tentativas. E o computador acertou em " + computador + " tentativas";
            }

            System.out.println("O número " + variacao);
            tentativas += 1;

        } while (numero != adivinha);


        sc.close();

    }

}

// metodo random para ver se o computador acerto
