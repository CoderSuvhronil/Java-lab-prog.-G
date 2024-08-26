// Base class Person
class Person {
    // Method to print a message from the Person class
    void message() {
        System.out.println("This is person class");
    }
}

// Subclass Student extending Person
class Student extends Person {
    // Overriding the message() method in the subclass
    @Override
    void message() {
        System.out.println("This is student class");
    }

    // Method to display messages from both classes
    void display() {
        // Calling the method from the superclass using super
        super.message();
        // Calling the overridden method in the subclass
        this.message();
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
