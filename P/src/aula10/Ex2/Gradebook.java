package aula10.Ex2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Gradebook {
   
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void load(String source) {
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|"); 
                if (parts.length == 4) { 
                    String name = parts[0];
                    List<Double> grades = new ArrayList<>();
                    grades.add(Double.parseDouble(parts[1]));
                    grades.add(Double.parseDouble(parts[2]));
                    grades.add(Double.parseDouble(parts[3]));
                    Student student = new Student(name, grades); 
                    addStudent(student); 
                } else {
                    System.err.println("Linha inválida no ficheiro: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }

    public void addStudent(Student newStudent) {
        if (!students.contains(newStudent)) {
            students.add(newStudent);
            System.out.println("Estudante adicionado: " + newStudent.getName() + ", Notas: " + newStudent.getGrades());
        } else {
            System.out.println("Estudante já existe: " + newStudent.getName() + ", Notas: " + newStudent.getGrades());
        }
    }

    public void removeStudent(String studentName) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null && students.remove(studentToRemove)) {
            System.out.println("Estudante removido: " + studentName);
        } else {
            System.out.println("Estudante não encontrado: " + studentName);
        }
    }

    public Student getStudent(String studentName) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                return student;
            }
        }
        System.out.println("Estudante não encontrado: " + studentName);
        return null; 
    }

    public double calculateAverageGrade(String studentName) {
        Student student = getStudent(studentName);
        if (student != null) {
            List<Double> grades = student.getGrades();
            if (grades.isEmpty()) {
                System.out.println("O estudante não tem notas registadas.");
                return 0.0;
            }
            double total = 0.0;
            for (double grade : grades) {
                total += grade;
            }
            return total / grades.size();
        }
        return 0.0;
    }

    public void printAllStudents() {
        for (Student student : students) {
            double averageGrade = calculateAverageGrade(student.getName());
            System.out.println("Nome: " + student.getName() + ", Notas: " + student.getGrades() + ", Média: " + averageGrade);
        }
    }

}
