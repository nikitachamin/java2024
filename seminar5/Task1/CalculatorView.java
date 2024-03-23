package seminar5.Task1;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    // Метод для получения операндов и оператора от пользователя
    public void getUserInput(CalculatorModel model) {
        System.out.print("Введите первый операнд: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();
        System.out.print("Введите второй операнд: ");
        double operand2 = scanner.nextDouble();

        // Устанавливаем операнды и оператор в модели
        model.setOperand1(operand1);
        model.setOperator(operator);
        model.setOperand2(operand2);
    }

    // Метод для вывода результата
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}