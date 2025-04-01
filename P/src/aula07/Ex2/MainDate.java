package aula07.Ex2;

public class MainDate{
    public static void main(String[] args) {
        
        DateND date = new DateND(27, 3, 2025);
        int daysDifference = date.calculateDaysDifference(30, 3, 2025);
        System.out.println("Diferença de dias:  " + daysDifference);
    }
}
