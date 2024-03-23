package seminar5.Task1.Task2;




import java.util.ArrayList;
import java.util.List;

// Модель (Model)
class TodoListModel {
    private List<String> tasks;

    public TodoListModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}