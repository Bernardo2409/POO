package aula07.Ex2;

public abstract class Date {

   
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

        public int daysCount(int day, int month, int year){
            int daysCount = 0;
            for(int i = 2000; i<year; i++){
                if(leapYear(i)){
                    daysCount += 366;
                }else{
                    daysCount += 365;
                }
            }
            for(int j = 1; j < month; j++){
                daysCount += monthDays(j, year);
            }
            daysCount += day;
            return daysCount;
        }
    
        public abstract void increment();
        public abstract void decrement();
        public abstract int getDay();
        public abstract int getMonth();
        public abstract int getYear();
    
}
