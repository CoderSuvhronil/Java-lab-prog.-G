class Animal {
    // Method to print the sound of an animal
    void sound() {
        System.out.println("Sound of Animals, which varies");
    }

    // Method to check if an animal has life
    boolean hasLife() {
        return true;
    }

    // Method to check if an animal has a tail
    boolean hasTail() {
        return true;
    }

    // Method to return the number of eyes
    int noOfEyes() {
        return 2;
    }

    // Method to return the number of legs
    int noOfLegs() {
        return 4;
    }
}

// Derived class Dog
class Dog extends Animal {
    // Overriding the sound() method for Dog
    @Override
    void sound() {
        System.out.println("Barking");
    }
}

// Derived class Tiger
class Tiger extends Animal {
    // Overriding the sound() method for Tiger
    @Override
    void sound() {
        System.out.println("Roaring");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        // Demonstrating method overriding
        dog.sound();   // Output: Barking
        tiger.sound(); // Output: Roaring
    }
}
