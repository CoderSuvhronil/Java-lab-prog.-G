// Base class Vehicle
class Vehicle {
    int maxSpeed = 100; // Data member of the base class
}

// Subclass Car extending Vehicle
class Car extends Vehicle {
    int maxSpeed = 140; // Data member of the subclass

    // Method to display speeds
    void display() {
        System.out.println("My parent’s speed was : " + super.maxSpeed + " KM/H");
        System.out.println("My Speed is : " + this.maxSpeed + " KM/H");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}
