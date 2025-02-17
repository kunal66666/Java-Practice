package ProtectedEx;

public class Dog extends Animal {
    protected void  displayInfo() {
        // Can access protected members from parent class
        name = "Buddy";
        makeSound();
        System.out.println("Dog name: " + name);
    }
}
