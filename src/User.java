import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {


    private String id;
    private String name;
    private String email;
    private List<Task> tasks;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksByStatus(Status status) {
        List<Task> filteredTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus() == status) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }


    public List<Task> getTasks() {
        return tasks;
    }
}
