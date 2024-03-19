package hometask3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList movies = new MyLinkedList();

        movies.addFirst("Маска");
        movies.addFirst("Матрица");
        movies.addFirst("Я, снова я и Ирэн");
        movies.addFirst("Зеленая миля");
        
        for (String movie : movies) {
            System.out.println(movie);
        }
    

    Employee worker1 = new Employee("Иван", 25, 35000);
    Employee worker2 = new Employee("Петр", 30, 40000);
    Employee worker3 = new Employee("Евгений", 45, 50000);
    Employee worker4 = new Employee("Петр", 23, 33000);
    
    ArrayList<Employee> Em = new ArrayList<>(List.of(worker1,worker2,worker3,worker4));
    System.out.println(worker1);
    System.out.println(worker2);
    System.out.println(worker3);
    System.out.println(worker4);
    System.out.println();
    
    Em.sort(new SalaryComporator());
    for (Employee employee : Em) {
        System.out.println(employee);
    }
}}