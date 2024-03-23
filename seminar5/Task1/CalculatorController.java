
package seminar5.Task1;
public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    // Метод для запуска калькулятора
    public void runCalculator() {
        view.getUserInput(model); // Получаем ввод от пользователя
        double result = model.calculate(); // Выполняем вычисление
        view.displayResult(result); // Выводим результат
    }
}