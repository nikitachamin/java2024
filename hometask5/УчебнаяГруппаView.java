package hometask5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class УчебнаяГруппаView {
    private static Scanner scanner = new Scanner(System.in);

   
    public static Преподаватель ввестиПреподавателя() {
        System.out.println("Введите ID преподавателя:");
        int преподавательId = scanner.nextInt();
        Преподаватель преподаватель = new Преподаватель();
        преподаватель.setId(преподавательId);
        return преподаватель;
    }

    public static List<Студент> ввестиСтудентов() {
        System.out.println("Введите количество студентов:");
        int количествоСтудентов = scanner.nextInt();
        List<Студент> студенты = new ArrayList<>();
        for (int i = 0; i < количествоСтудентов; i++) {
            System.out.println("Введите ID студента " + (i + 1) + ":");
            int студентId = scanner.nextInt();
            Студент студент = new Студент();
            студент.setId(студентId);
            студенты.add(студент);
        }
        return студенты;
    }

    public void показатьУчебнуюГруппу(УчебнаяГруппа учебнаяГруппа) {
        Преподаватель преподаватель = учебнаяГруппа.getПреподаватель();
        List<Студент> студенты = учебнаяГруппа.getСтуденты();

        System.out.println("Преподаватель:");
        System.out.println("ID: " + преподаватель.getId());

        System.out.println("Студенты:");
        for (Студент студент : студенты) {
            System.out.println("ID: " + студент.getId());
        }
    }
}
