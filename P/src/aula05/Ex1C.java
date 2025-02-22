package aula05;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex1C {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        List<Integer> data = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            System.out.print("Choose an option: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    boolean validDate = false;
                    int day = 0, month = 0, year = 0;
                    while (validDate == false) {
                        System.out.print("Day: ");
                        day = sc.nextInt();
                        System.out.print("Month: ");
                        month = sc.nextInt();
                        System.out.print("Year: ");
                        year = sc.nextInt();
                        if (DateYMD.valid(day, month, year)) {
                            data.add(day);
                            data.add(month);
                            data.add(year);
                            System.out.println("Deu certo.");
                            validDate = true;
                        } else {
                            System.out.println("Invalido");
                        }
                    }
                    break;
                case 2:
                    if (data != null) {
                        System.out.printf("A data atual é: %02d/%02d/%04d%n", data.get(0), data.get(1), data.get(2));
                    } else {
                        System.out.println("Data não definida");
                    }
                    break;
                case 3: 
                    if (!data.isEmpty()) {
                        DateYMD date = new DateYMD(data.get(0), data.get(1), data.get(2));
                        date.increment();
                        data.set(0, date.getDay());
                        data.set(1, date.getMonth());
                        data.set(2, date.getYear());
                        System.out.printf("Data incrementada: %02d/%02d/%04d%n", data.get(0), data.get(1), data.get(2));
                    } else {
                        System.out.println("Nenhuma data definida.");
                    }
                    break;
                    case 4: 
                    if (!data.isEmpty()) {
                        DateYMD date = new DateYMD(data.get(0), data.get(1), data.get(2));
                        date.decrement();
                        data.set(0, date.getDay());
                        data.set(1, date.getMonth());
                        data.set(2, date.getYear());
                        System.out.printf("Data decrementada: %02d/%02d/%04d%n", data.get(0), data.get(1), data.get(2));
                    } else {
                        System.out.println("Nenhuma data definida.");
                    }
                    break;
            }

        } while (opcao != 0);
        sc.close();

    }

}




    
 