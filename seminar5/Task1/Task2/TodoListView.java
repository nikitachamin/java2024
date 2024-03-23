package seminar5.Task1.Task2;

import java.util.List;
import java.util.Scanner;

// Представление (View)
class TodoListView {
    private Scanner scanner;

    public TodoListView() {
        scanner = new Scanner(System.in);
    }

    public String getTaskDescription() {
        System.out.print("Введите описание задачи: ");
        return scanner.nextLine();
    }

    public void displayTasks(List<String> tasks) {
        System.out.println("Todo List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }


public int getUserChoice() {
    System.out.println("1. Добавить задачу");
    System.out.println("2. Показать задачи");
    System.out.println("3. Выход");
    System.out.print("Выберите действие: ");
    return scanner.nextInt();
}}