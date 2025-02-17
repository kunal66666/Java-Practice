package INNER;

interface Animal {
    void makeSound();
    void sleep();
}

// Regular class implementation


public class Annoynomousinnerclass {
    public static void main(String[] args) {
        // Regular class implementation
        Animal regularDog = new Dog();
        regularDog.makeSound();

        //to implment on the fly we use annomcyos implmentation
        // Anonymous inner class implementing Animal interface
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Woof! Woof!");
            }
            public void sleep() {
                System.out.println("Woof! sleep!");
            }
        };

        // Anonymous inner class implementing Animal interface differently
        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Meow! Meow!");
            }
            public void sleep() {
                System.out.println("Meow! Meow! sleep");
            }
        };

        // Calling methods
        dog.makeSound();
        cat.makeSound();
    }
}