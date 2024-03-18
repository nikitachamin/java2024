package hometask2.Flyable;

import hometask2.Vehicle;

public class Aircraft extends Vehicle implements Flyable {
    int maxAltitude;
    boolean isFlying;


public Aircraft(String brand, String model, int year, int maxAltitude){
    super(brand, model, year);
    this.maxAltitude = maxAltitude;
    this.isFlying = false;
}

@Override
public void startEngine(){
    System.out.println("Включение двигателя");
}


@Override
public void stopEngine(){
    System.out.println("Включение двигателя");
    
}

@Override
public void takeOff(){
    System.out.println("Самолет взлетает");
    isFlying = true;
}


@Override
public void land() {
    System.out.println("Самолет приземлился");
    isFlying = false;
}

@Override
public void accelerate(int speed){
    if(isFlying){
        System.out.println("Самолет ускорился на " + speed + " км в час");
    }
    else{
        System.out.println("Самолет ещё не взлетелб не можем ускориться");
    }
}
       
@Override
public void brake(){
    System.out.println("Остановились, скорость : 0");
}


@Override
public void displayInfo() {
    System.out.println("ID: " + id);
    System.out.println("Марка: " + brand);
    System.out.println("Модель: " + model);
    System.out.println("Год выпуска: " + year);
    System.out.println("Максимальная высота полета: " + maxAltitude + " м");
    System.out.println("Состояние полета: " + (isFlying ? "в воздухе" : "на земле"));
}
}
