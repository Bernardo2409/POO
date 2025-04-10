package Learning6;

import java.util.Scanner;

public class emailval {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insere o teu email: ");
        String email = sc.nextLine();

        if (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            System.out.println("Email válido ");
        } else {
            System.out.println("Email inválido ");
        }

        sc.close();
    }
}
