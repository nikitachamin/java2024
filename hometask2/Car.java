package hometask2;

public class Car extends Vehicle {
    private int fuelCapacity;
    private int CurrentFuelLevel;

public Car(String brand, String model, int year, int fuelCapacity){
    super(brand, model, year);
    this.fuelCapacity = fuelCapacity;
    this.CurrentFuelLevel = fuelCapacity;
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
public void accelerate(int speed){
        System.out.println("Автомобиль ускорился на " + speed + " км в час");
    }
@Override
public void brake(){
    System.out.println("Остановились, скорость : 0");
    

}

void refuel(int liters){
    CurrentFuelLevel += liters;
    if(CurrentFuelLevel>fuelCapacity){
        CurrentFuelLevel = fuelCapacity;
    }
}

public void displayInfo() {
    System.out.println("ID: "+ id);
    System.out.println("brand: "+ brand);
    System.out.println("model: " + model);
    System.out.println("year: "+ year);
    System.out.println("Умкость топливного бака: "+ fuelCapacity+ " литров");
    System.out.println("Текущий уровень топлива: "+ CurrentFuelLevel);
    
}
}

