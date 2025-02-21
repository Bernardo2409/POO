package aula02;
import java.util.Scanner;
public class Ex3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cata,catb;
        do { 
            System.out.print("Cateto A?");
            cata = sc.nextDouble();
        } while(cata <= 0);
        do {
            System.out.println("Cateto B?");
            catb = sc.nextDouble();
        } while(catb <= 0);

        double hipotenusa = Math.hypot(cata,catb);
        System.out.println("O valor da hipotenusa é:" + hipotenusa);
        double angulo = Math.toDegrees(Math.atan2(cata,catb));
        System.out.println("O valor do ângulo entre o cateto A e a hipotenusa é " + angulo);

        sc.close();
    }

}
