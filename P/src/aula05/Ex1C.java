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
                        if (DataYMD.valid(day, month, year)) {
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
                        DataYMD date = new DataYMD(data.get(0), data.get(1), data.get(2));
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
                        DataYMD date = new DataYMD(data.get(0), data.get(1), data.get(2));
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

class DataYMD {

    private int day;
    private int month;
    private int year;

    public DataYMD(int day, int month, int year) {
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public static boolean validMonth(int month) {

        if (0 < month && month < 13) {
            return true;
        } else {
            return false;
        }
            
        }
    
        public static boolean leapYear(int year) {

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                
                return true; }
            else { 
                return false;
            }
        }

        public static int monthDays(int month, int year) {
            switch (month) {
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    if (leapYear(year) == true) {
                        return 29; 
                    } else {
                        return 28;
                    }
                default:
                    return 31;
            }
        }


        public static boolean valid(int day, int month, int year) {
            if ( validMonth(month) == true && monthDays(month, year) >= day) {
                return true;
            } else {
                return false;
            }
        }

        public void increment() {
            if (day < monthDays(month, year)) {
                day++;
            } else {
                day = 1;
                if (month < 12) {
                    month++;
                } else {
                    month = 1;
                    year++;
                }
            }

        }

        public void decrement() {
            if (day > 1) {
                day--;
            } else {
                if (month > 1) {
                    month--;
                    day = monthDays(month, year);
                } else {
                    month = 12;
                    year--;
                    day = 31;
                }
            }
        }
        public int getDay() {
            return day; 
        }
        public int getMonth() { 
            return month; 
        }
        public int getYear() { 
            return year; 
        }
        
    }


    
 