package aula07.Ex2;

class DateND extends DateYMD { 

    int counter = 0;
    public DateND(int day, int month, int year) {
        super(day, month, year); 
    }
    
    public int compareDate(int day, int month, int year) {
        if (year > this.year) {
            return 1; 
        } else if (year < this.year) {
            return -1; 
        } else {
            if (month > this.month) {
                return 1;
            } else if (month < this.month) {
                return -1; 
            } else {
                if (day > this.day) {
                    return 1; 
                } else if (day < this.day) {
                    return -1; 
                } else {
                    return 0; 
                }
            }
        }
    }
    public int calculateDaysDifference(int day, int month, int year) {
        counter = 0; 
        while (compareDate(day, month, year) != 0) {
            if (compareDate(day, month, year) == -1) {
                increment(); 
                counter++; 
            } else if (compareDate(day, month, year) == 1) {
                decrement(); 
                counter++; 
            }
        }
        return counter; 
    }
    

    
}

// enquanto a data não é igual à data final, vai usando o counter