import java.util.Scanner;

public class Ex2C {
    
    private int year;
    private int firstWeekDay;
    private int[][] events;

    public void Inicio(int year, int firstWeekDay) {
        this.year = year;
        this.firstWeekDay = firstWeekDay;
        this.events = new int[12][31]; 
    }

    public int year() {
        return year;
    }
    
    public int firstWeekDayofYear() {
        return firstWeekDay;
    }
    
    public int firstWeekdayOfMonth(int month) {
        int days = 0;
        for (int m = 1; m < month; m++) {
            days += DataYMD.monthDays(m, year);
        }
        int days_ano = days % 7;
        int firstDay = firstWeekDay + days_ano;
        if (firstDay > 7) {
            firstDay = firstDay - 7;
        }
        return firstDay;
    }

    public void addEvent(DataYMD date) {
        events[date.getMonth() - 1][date.getDay() - 1]++;
    }
    
    public void removeEvent(DataYMD date) {
        if (events[date.getMonth() - 1][date.getDay() - 1] > 0) {
            events[date.getMonth() - 1][date.getDay() - 1]--;
        }
    }

    public String printMonth(int month) {
        StringBuilder sb = new StringBuilder();
        String[] weekDays = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
        
        sb.append(String.format("%n%s %d%n", monthName(month), year));
        for (String wd : weekDays) {
            sb.append(wd).append(" ");
        }
        sb.append("\n");
        
        int firstDay = firstWeekdayOfMonth(month);
        int daysInMonth = DataYMD.monthDays(month, year);
        
        for (int i = 1; i < firstDay; i++) {
            sb.append("   ");
        }
        
        for (int day = 1; day <= daysInMonth; day++) {
            if (events[month - 1][day - 1] > 0) {
                sb.append("*");
            }
            sb.append(String.format("%2d ", day));
            if ((firstDay + day - 1) % 7 == 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    public String printYear() {
        StringBuilder sb = new StringBuilder();
        for (int month = 1; month <= 12; month++) {
            sb.append(printMonth(month)).append("\n");
        }
        return sb.toString();
    }
    
    private String monthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex2C calendar = null;
        int opcao;

        do {
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("0 - exit");
            System.out.print("Choose an option: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter first weekday of the year: ");
                    int firstWeekDay = sc.nextInt();
                    calendar = new Ex2C();
                    calendar.Inicio(year, firstWeekDay);
                    System.out.println("Calendar created successfully.");
                    break;
                case 2:
                    if (calendar != null) {
                        System.out.print("Enter month: ");
                        int month = sc.nextInt();
                        System.out.println(calendar.printMonth(month));
                    } else {
                        System.out.println("No calendar created.");
                    }
                    break;
                case 3:
                    if (calendar != null) {
                        System.out.println(calendar.printYear());
                    } else {
                        System.out.println("No calendar created.");
                    }
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        } while (opcao != 0);
    }
}