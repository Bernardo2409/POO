package Learning8;

import java.time.LocalDate;

public class TaskTester {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.readFile("tarefas.txt");

        Task t1 = new Task("Entregar projeto POO", Task.Priority.HIGH, LocalDate.of(2025, 6, 5));
        Task t2 = new Task("Comprar bilhetes", Task.Priority.MEDIUM, LocalDate.of(2025, 5, 30));
        Task t3 = new Task("Estudar para exame", Task.Priority.HIGH, LocalDate.of(2025, 6, 10));

        manager.addTask(t1);
        manager.addTask(t2);
        manager.addTask(t3);

        manager.markAsCompleted(t2.getId());

        System.out.println("\n--- Tarefas pendentes ---");
        manager.getPendingTasks().forEach(System.out::println);

        System.out.println("\n--- Tarefas antes de 01/06/2025 ---");
        manager.getTasksDueBefore(LocalDate.of(2025, 6, 1)).forEach(System.out::println);

        System.out.println("\n--- Tarefas por prioridade ---");
        manager.sortByPriority().forEach(System.out::println);

        System.out.println("\n--- Todas as tarefas ---");
        manager.printAllTasks();

        manager.writeFile("tarefas.txt");
    }
}

