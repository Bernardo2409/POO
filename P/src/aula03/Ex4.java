package aula03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {
        String[] notas = {"Name", "gradeT", "gradeP", "finalGrade"};
        
        for (String nota : notas) {
            System.out.printf("%-5s\t", nota);
        }
        System.out.println();

        String filePath = "D:/UA/1ano/2 semestre/POO/P/src/aula03/students.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] values = line.split(" ");
                double gradeT = Double.parseDouble(values[1]);
                double gradeP = Double.parseDouble(values[2]);

                double finalGrade = (gradeT < 7.0 || gradeP < 7.0) ? 66 : Math.round(0.4 * gradeT + 0.6 * gradeP);

                System.out.printf("%-5s\t%-5s\t%-5s\t%-5.2f\n", values[0], values[1], values[2], finalGrade);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}
