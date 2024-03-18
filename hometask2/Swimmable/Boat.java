package hometask2.Swimmable;

import hometask2.Vehicle;

public class Boat extends Vehicle implements Swimmable {
    int maxSpeed;
    boolean isSailing;
    

public Boat(String brand, String model, int year, int maxSpeed){
    super(brand, model, year);
    this.maxSpeed = maxSpeed;
    this.isSailing = false;
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
public void startSwimming(){
    System.out.println("Лодка начала движение по воде");
    isSailing = true;
}


@Override
public void stopSwimming() {
    System.out.println("Лодка перестала  плыть");
    isSailing = false;
}

@Override
public void accelerate(int speed){
    if(isSailing){
        System.out.println("Лодка ускорилась на " + speed + " км в час");
    }
    else{
        System.out.println("Лодка ещё не на воде,  не можем ускориться");
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
    System.out.println("Максимальная скорость лодки: " + maxSpeed + " м");
    System.out.println("Состояние лодки " + (isSailing ? "в воде" : "на земле"));
}
}
