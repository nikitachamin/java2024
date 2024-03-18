package check;

// Абстрактный класс Vehicle
abstract class Vehicle {
    private static int idCounter = 0;
    protected int id;
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.id = ++idCounter;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate(int speed);
    public abstract void brake();
    public abstract void displayInfo();
}

// Интерфейс Flyable
interface Flyable {
    void takeOff();
    void land();
}

// Интерфейс Swimmable
interface Swimmable {
    void startSwimming();
    void stopSwimming();
}

// Класс Car
class Car extends Vehicle {
    private int fuelCapacity;
    private int currentFuelLevel;

    public Car(String brand, String model, int year, int fuelCapacity) {
        super(brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = fuelCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель автомобиля запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель автомобиля остановлен.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Автомобиль ускоряется на " + speed + " км/ч.");
    }

    @Override
    public void brake() {
        System.out.println("Автомобиль прекращает движение.");
    }

    public void refuel(int liters) {
        System.out.println("Автомобиль заправлен на " + liters + " литров топлива.");
        currentFuelLevel += liters;
        if (currentFuelLevel > fuelCapacity) {
            currentFuelLevel = fuelCapacity;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Емкость топливного бака: " + fuelCapacity + " л");
        System.out.println("Текущий уровень топлива: " + currentFuelLevel + " л");
    }
}

// Класс Aircraft
class Aircraft extends Vehicle implements Flyable {
    private int maxAltitude;
    private boolean isFlying;

    public Aircraft(int i, String brand, String model, int year, int maxAltitude) {
        super(brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель самолета запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель самолета остановлен.");
    }

    @Override
    public void takeOff() {
        System.out.println("Самолет взлетает.");
        isFlying = true;
    }

    @Override
    public void land() {
        System.out.println("Самолет приземляется.");
        isFlying = false;
    }

    @Override
    public void accelerate(int speed) {
        if (isFlying) {
            System.out.println("Самолет увеличивает скорость на " + speed + " км/ч.");
        } else {
            System.out.println("Самолет на земле, невозможно увеличить скорость.");
        }
    }

    @Override
    public void brake() {
        System.out.println("Самолет прекращает движение.");
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

// Класс Boat
class Boat extends Vehicle implements Swimmable {
    private int maxSpeed;
    private boolean isSailing;

    public Boat(int i, String brand, String model, int year, int maxSpeed) {
        super(brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель лодки запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель лодки остановлен.");
    }

    @Override
    public void startSwimming() {
        System.out.println("Лодка начинает движение по воде.");
        isSailing = true;
    }

    @Override
    public void stopSwimming() {
        System.out.println("Лодка прекращает движение по воде.");
        isSailing = false;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Лодка увеличивает скорость на " + speed + " узлов.");
    }

    @Override
    public void brake() {
        System.out.println("Лодка прекращает движение.");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Максимальная скорость на воде: " + maxSpeed + " узлов");
        System.out.println("Состояние движения по воде: " + (isSailing ? "движется" : "стоит"));
    }
}

// Главны