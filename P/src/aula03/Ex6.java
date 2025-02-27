package aula03;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = readMonth(scanner);
        int year = readYear(scanner);
        int startDay = readStartDay(scanner);

        int daysInMonth = getDaysInMonth(month, year);

        printCalendar(month, year, startDay, daysInMonth);
    }

    private static int readMonth(Scanner scanner) {
        int month;
        do {
            System.out.print("Enter the month (1-12): ");
            month = scanner.nextInt();
        } while (month < 1 || month > 12);
        return month;
    }

    private static int readYear(Scanner scanner) {
        int year;
        do {
            System.out.print("Enter the year (>= 1): ");
            year = scanner.nextInt();
        } while (year < 1);
        return year;
    }

    private static int readStartDay(Scanner scanner) {
        int startDay;
        do {
            System.out.print("Enter the starting day (1 = Monday, 7 = Sunday): ");
            startDay = scanner.nextInt();
        } while (startDay < 1 || startDay > 7);
        return startDay;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return (isLeapYear(year) ? 29 : 28);
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
        }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static void printCalendar(int month, int year, int startDay, int daysInMonth) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] weekDays = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};

        System.out.printf("%n%10s %d%n", monthNames[month], year);
        for (String day : weekDays) {
            System.out.print(day + " ");
        }
        System.out.println();

        int currentDay = 1;
        for (int i = 1; i < startDay; i++) {
            System.out.print("   ");
        }

        while (currentDay <= daysInMonth) {
            System.out.printf("%2d ", currentDay);
            if ((currentDay + startDay - 1) % 7 == 0) {
                System.out.println();
            }
            currentDay++;
        }
        System.out.println();
    }
}

