package aula03;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {
        String filePath = "D:\\UA\\1ano\\2 semestre\\POO\\P\\src\\aula03\\students.txt";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\\s+");
                if (values.length < 3) continue;

                String name = values[0];
                double gradeT = Double.parseDouble(values[1]);
                double gradeP = Double.parseDouble(values[2]);

                students.add(new Student(name, gradeT, gradeP));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        double avgGradeT = students.stream().mapToDouble(Student::getGradeT).average().orElse(0.0);
        double avgGradeP = students.stream().mapToDouble(Student::getGradeP).average().orElse(0.0);

        System.out.printf("Average gradeT: %.2f%n", avgGradeT);
        System.out.printf("Average gradeP: %.2f%n", avgGradeP);

        System.out.println("Students with gradeT above average:");
        students.stream()
                .filter(student -> student.getGradeT() > avgGradeT)
                .forEach(student -> System.out.println(student.getName()));
    }

    public static class Student {
        private String name;
        private double gradeT;
        private double gradeP;

        public Student(String name, double gradeT, double gradeP) {
            this.name = name;
            this.gradeT = gradeT;
            this.gradeP = gradeP;
        }

        public String getName() {
            return name;
        }

        public double getGradeT() {
            return gradeT;
        }

        public double getGradeP() {
            return gradeP;
        }
    }
}