import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User("u1", "Karan", "Karan@example.com");


        Task task1 = new Task("t1", "Buy pen", "write in board", LocalDate.of(2025, 5, 30), Priority.MEDIUM);
        Task task2 = new Task("t2", "But copy", "write in copy", LocalDate.of(2025, 6, 5), Priority.HIGH);


        user.addTask(task1);
        user.addTask(task2);


        System.out.println("Tasks before removal:");
        printTasks(user.getTasks());


        removeTaskById(user, "t1");


        System.out.println("\nTasks after removal:");
        printTasks(user.getTasks());
    }


    public static void printTasks(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println("- Task ID: " + task.getId() + ", Title: " + task.getTitle());
        }
    }


    public static void removeTaskById(User user, String taskId) {
        List<Task> tasks = user.getTasks();
        Task toRemove = null;

        for (Task task : tasks) {
            if (task.getId().equals(taskId)) {
                toRemove = task;
                break;
            }
        }

        if (toRemove != null) {
            tasks.remove(toRemove);
            System.out.println("Removed task with ID: " + taskId);
        } else {
            System.out.println("Task with ID " + taskId + " not found.");
        }
    }
    }









