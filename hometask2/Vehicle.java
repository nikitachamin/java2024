package hometask2;

// Абстрактный класс Vehicle:

// Содержит общие свойства и методы для всех видов транспортных средств.
// Свойства: int id (уникальный идентификатор), String brand (марка), String model (модель), int year (год выпуска).
// Методы:
// void startEngine() - запуск двигателя (реализация в подклассах).
// void stopEngine() - остановка двигателя (реализация в подклассах).
// void accelerate(int speed) - увеличение скорости на указанное значение (реализация в подклассах).
// void brake() - прекращение движения (реализация в подклассах).
// abstract void displayInfo() - вывод информации о транспортном средстве (реализация в подклассах).

public abstract class Vehicle{
    private static int idCounter = 0;
    protected int id;
    protected String brand;
    protected String model;
    protected int year;
   


public Vehicle(String brand, String model, int year){
    this.id =  ++idCounter;
    this.brand = brand;
    this.model = model;
    this.year = year;
}




public abstract  void startEngine();
public abstract void stopEngine();
public abstract  void accelerate(int speed);
public abstract  void brake();
public abstract void displayInfo();
}
