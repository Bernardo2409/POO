
package aula02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Abcissa do ponto 1?");
        int x1 = sc.nextInt();
        System.out.print("Ordenada do ponto 1?");
        int y1 = sc.nextInt();
        System.out.print("Abcissa do ponto 2?");
        int x2 = sc.nextInt();
        System.out.print("Ordenada do ponto 2?");
        int y2 = sc.nextInt();

        double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.print(d);

        sc.close();
    }
}


