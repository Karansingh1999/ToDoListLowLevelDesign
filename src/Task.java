import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Task {

    private String id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private Priority priority;
    private Status status;
    private List<SubTask> subtasks;

    public Task(String id, String title, String description, LocalDate dueDate, Priority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = Status.PENDING;
        this.subtasks = new ArrayList<>();
    }

    public void addSubtask(SubTask subtask) {
        subtasks.add(subtask);
        updateStatusBasedOnSubtasks();
    }

    public void markComplete() {
        this.status = Status.COMPLETED;
        for (SubTask sub : subtasks) {
            sub.setStatus(Status.COMPLETED);
        }
    }

    public void markIncomplete() {
        this.status = Status.PENDING;
        for (SubTask sub : subtasks) {
            sub.setStatus(Status.PENDING);
        }
    }

    public int getProgressPercentage() {
        if (subtasks.isEmpty()) {
            if(status == Status.COMPLETED)
            {
                return 100;
            }
            else{
                return 0;
            }
        }

        int completed = 0;
        for (SubTask sub : subtasks) {
            if (sub.getStatus() == Status.COMPLETED) completed++;
        }
        return (completed * 100) / subtasks.size();
    }

    public void updateStatusBasedOnSubtasks() {
        if (subtasks.isEmpty()) return;

        boolean allCompleted = true;
        boolean allPending = true;

        for (SubTask subtask : subtasks) {
            if (subtask.getStatus() != Status.COMPLETED) {
                allCompleted = false;
            }
            if (subtask.getStatus() != Status.PENDING) {
                allPending = false;
            }
        }

        if (allCompleted) {
            this.status = Status.COMPLETED;
        } else if (allPending) {
            this.status = Status.PENDING;
        } else {
            this.status = Status.PENDING;
        }
    }
    public Status getStatus() {
        return this.status;
    }
    public String getId() { return id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
