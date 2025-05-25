package Learning8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Task {

    private static int nextId = 1;
    private int id;
    private String description;
    private Priority priority;
    private LocalDate creation_date;
    private LocalDate limit_date;
    private boolean state;

    public enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }

    public Task(String description, Priority priority, LocalDate limit_date) {
        this.id = nextId++;
        this.description = description;
        this.priority = priority;
        this.creation_date = LocalDate.now();
        this.limit_date = limit_date;
        this.state = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public LocalDate getLimit_date() {
        return limit_date;
    }

    public boolean isCompleted() {
        return state;
    }

    public void markCompleted() {
        this.state = true;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Task [Id=" + id + ", description=" + description + ", priority=" + priority +
               ", creation_date=" + creation_date.format(formatter) +
               ", limit_date=" + limit_date.format(formatter) + ", completed=" + state + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        return description.equalsIgnoreCase(other.description) &&
               priority == other.priority &&
               limit_date.equals(other.limit_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description.toLowerCase(), priority, limit_date);
    }

    public String toFileString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return id + ";" + description + ";" + priority + ";" + creation_date.format(formatter) + ";" +
               limit_date.format(formatter) + ";" + state;
    }

    public static Task fromFileString(String line) {
        try {
            String[] parts = line.split(";");
            int id = Integer.parseInt(parts[0]);
            String description = parts[1];
            Priority priority = Priority.valueOf(parts[2]);
            LocalDate creationDate = LocalDate.parse(parts[3]);
            LocalDate limitDate = LocalDate.parse(parts[4]);
            boolean state = Boolean.parseBoolean(parts[5]);

            Task t = new Task(description, priority, limitDate);
            t.creation_date = creationDate;
            t.state = state;
            t.id = id;
            if (id >= nextId) nextId = id + 1;
            return t;
        } catch (Exception e) {
            System.out.println("Erro ao ler linha: " + line);
            return null;
        }
    }
}
