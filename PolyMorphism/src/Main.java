//class Calculator {
//    // Method to add two integers
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    // Overloaded method to add three integers
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    // Overloaded method to add two double values
//    public double add(double a, double b) {
//        return a + b;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//
//        // Using different overloaded methods
//        System.out.println("Sum of two integers: " + calc.add(5, 10)); // Calls add(int, int)
//        System.out.println("Sum of three integers: " + calc.add(5, 10, 15)); // Calls add(int, int, int)
//        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5)); // Calls add(double, double)
//    }
//}
//Method overloading is another concept of polymorphism, specifically compile-time polymorphism, in Java. It allows a class to have multiple methods with the same name but different parameter lists. Here's an example of method overloading:







// Base class
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
    public void eat(){
        System.out.println("Eat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Demonstrating polymorphism
        Animal myAnimal;  // Reference of the base class

        // Assign a Dog object to the Animal reference
        myAnimal = new Dog();
        myAnimal.sound(); // Output: Dog barks

        // Assign a Cat object to the Animal reference
        myAnimal = new Cat();
        myAnimal.sound(); // Output: Cat meows


    }
}

//new means here dymically locsation of memory so we are doing
//myAnimal = new Cat(); we are assign cat at run time tjhat why
//called run time polyrmryc or dynmic plyrmorpsm

//Method Overriding:
//
//Both Dog and Cat classes override the sound method of the Animal class.
//Dynamic Method Dispatch:
//
//The sound method that gets called depends on the actual object (Dog or Cat) assigned to the Animal reference at runtime.
//Base Class Reference:

//The base class Animal is used to hold references to objects of derived classes (Dog and Cat