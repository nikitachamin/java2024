package hometask2;
import hometask2.Flyable.*;
import hometask2.Swimmable.*;
public class Main {
    public static void main(String[] args) {
        // Создание объектов различных транспортных средств
        Car car = new Car("Toyota", "Camry", 2022, 30);
        Aircraft aircraft = new Aircraft("Boing", "747", 2010, 35000);
        Boat boat = new Boat("Sea Ray", "Sundancer", 2015, 50);

        // Демонстрация работы транспортных средств
        System.out.println("Демонстрация работы автомобиля:");
        car.startEngine();
        car.accelerate(60);
        car.brake();
        car.refuel(20);
        car.displayInfo();

        System.out.println("\nДемонстрация работы самолета:");
        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.land();
        aircraft.stopEngine();
        aircraft.displayInfo();

        System.out.println("\nДемонстрация работы лодки:");
        boat.startEngine();
        boat.startSwimming();
        boat.stopSwimming();
        boat.stopEngine();
        boat.displayInfo();
    }
}