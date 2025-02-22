package aula05;

public class DateYMD {

    private int day;
    private int month;
    private int year;

    public DateYMD(int day, int month, int year) {
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