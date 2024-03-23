package seminar5.Task1.Task2;

// Контроллер (Controller)
class TodoListController {
    private TodoListModel model;
    private TodoListView view;

    public TodoListController(TodoListModel model, TodoListView view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        boolean running = true;
        while (running) {
            int choice = view.getUserChoice();
            switch (choice) {
                case 1:
                    String task = view.getTaskDescription();
                    model.addTask(task);
                    break;
                case 2:
                    view.displayTasks(model.getTasks());
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}