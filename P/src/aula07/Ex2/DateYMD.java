package aula07.Ex2;

class DateYMD extends Date {

    protected int day;
    protected int month;
    protected int year;

    public DateYMD(int day, int month, int year) {
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public int getDays(){
        return daysCount(day, month, year);
    }
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

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
    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
    @Override
	public int hashCode() {
		return daysCount(day, month, year);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() == obj.getClass()){
            return this.getDays() == ((DateYMD) obj).getDays();
        }else if(obj instanceof Date){
            return this.getDays() == ((DateND) obj).getDays();
        }else{
            return false;
        }
	}
    public int compareTo(Date o){
        return this.hashCode() == o.hashCode() ? 0 : this.getDays() > o.hashCode() ? 1 : -1;
    }
        
        
}
