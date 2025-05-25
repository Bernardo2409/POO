package Learning8;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TaskManager {

    private Map<Integer, Task> agenda = new HashMap<>();

    public void addTask(Task t) {
        for (Task task : agenda.values()) {
            if (task.equals(t)) return;
        }
        agenda.put(t.getId(), t);
    }

    public void removeTask(int id) {
        agenda.remove(id);
    }

    public Task getTask(int id) {
        return agenda.get(id);
    }

    public void markAsCompleted(int id) {
        Task t = getTask(id);
        if (t != null) t.markCompleted();
    }

    public List<Task> getPendingTasks() {
        return agenda.values().stream()
                .filter(t -> !t.isCompleted())
                .collect(Collectors.toList());
    }

    public List<Task> getTasksDueBefore(LocalDate date) {
        return agenda.values().stream()
                .filter(t -> t.getLimit_date().isBefore(date))
                .collect(Collectors.toList());
    }

    public List<Task> sortByPriority() {
        return agenda.values().stream()
                .sorted(Comparator.comparing(Task::getPriority).reversed())
                .collect(Collectors.toList());
    }

    public void printAllTasks() {
        agenda.values().forEach(System.out::println);
    }

    public void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Task t = Task.fromFileString(line);
                if (t != null) addTask(t);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler ficheiro: " + e.getMessage());
        }
    }

    public void writeFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Task t : agenda.values()) {
                writer.println(t.toFileString());
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever ficheiro: " + e.getMessage());
        }
    }
}
