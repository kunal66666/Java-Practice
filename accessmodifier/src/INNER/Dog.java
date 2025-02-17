package INNER;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("norm Woof!");
    }

    @Override
    public void sleep() {
        System.out.println("norm sleep!");
    }
}