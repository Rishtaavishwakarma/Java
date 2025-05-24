// Interface (Abstraction)

interface Vehicle {

    void start(); // abstract method
}

// Base class (Encapsulation & Inheritance)
class Person {

    private String name;  // private = encapsulated

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}

// Derived class (Inheritance + Polymorphism)
class Car implements Vehicle {

    protected String model;

    // Constructor
    public Car(String model) {
        this.model = model;
    }

    // Method from interface (Abstraction + Polymorphism)
    public void start() {
        System.out.println("Car " + model + " is starting...");
    }

    // Method Overriding
    public String toString() {
        return "Car model: " + model;
    }
}

// Subclass of Car (Multi-level Inheritance)
class ElectricCar extends Car {

    private int batteryLevel;

    public ElectricCar(String model, int batteryLevel) {
        super(model); // calling parent constructor
        this.batteryLevel = batteryLevel;
    }

    // Overriding start() method (Polymorphism)
    @Override
    public void start() {
        System.out.println("Electric car " + model + " is starting silently with battery level: " + batteryLevel + "%");
    }
}

public class oops {

    public static void main(String[] args) {

        // Object creation & constructor usage
        Person p1 = new Person("Alice");
        System.out.println("Person name: " + p1.getName()); // encapsulated access

        // Interface reference holding object
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new ElectricCar("Tesla", 90);

        // Polymorphism - different behaviors for same method
        System.out.println("\nPolymorphism (start):");
        v1.start(); // Car version
        v2.start(); // ElectricCar version

        // toString() overridden method
        Car c1 = new Car("Honda");
        System.out.println("\n" + c1);
    }
}
