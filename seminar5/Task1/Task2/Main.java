package seminar5.Task1.Task2;

// Основной класс приложения
public class Main {
    public static void main(String[] args) {
        TodoListModel model = new TodoListModel();
        TodoListView view = new TodoListView();
        TodoListController controller = new TodoListController(model, view);
        controller.processUserInput();
    }
}