    package aula10.Ex2;

    import java.util.ArrayList;
    import java.util.Arrays;

    public class GradebookTester {
        public static void main(String[] args) {
            // Create a new Gradebook instance
            Gradebook gradebook = new Gradebook();

            // Load the student data from a text file
            gradebook.load("D:/UA/1ano/2 semestre/POO/P/src/aula10/Ex2/alunos.txt");

            // Add a new student to the collection
            Student newStudent = new Student("Johny May", new ArrayList<>(Arrays.asList(10.0, 15.0, 19.0)));
            gradebook.addStudent(newStudent);

            // Remove a student from the collection
            gradebook.removeStudent("Jane Smith");

            // Retrieve a student from the collection
            Student student = gradebook.getStudent("John Doe");

            // Calculate the average grade for a specific student
            double averageGrade = gradebook.calculateAverageGrade("John Doe");
            System.out.println("Average grade for John Doe: " + averageGrade);

            System.out.println(student);

            // Print a summary of all students in the collection
            gradebook.printAllStudents();
        }
    }
