package seminar4.task1;

public class Main {
    public static void main(String[] args) {
        // Создаем объект типа Gen<Integer>
        Gen<Integer> iOb = new Gen<>(88);

        // Отображаем тип данных, используемый в объекте iOb
        iOb.showType();

        // Получаем значение из объекта iOb
        int v = iOb.getob();
        System.out.println("Значение: " + v);

        System.out.println();

        // Создаем объект типа Gen<String>
        Gen<String> strOb = new Gen<>("Тестирование");

        // Отображаем тип данных, используемый в объекте strOb
        strOb.showType();

        // Получаем значение из объекта strOb
        String str = strOb.getob();
        System.out.println("Значение: " + str);
    }
}