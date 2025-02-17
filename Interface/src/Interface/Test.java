package Interface;

public class Test {

    public static void main(String[] args) {
        // Creating a Dog object
        Animal dog = new Dog();

        // Calling methods implemented by Dog class
        dog.sleep();  // Output: Dog sleep
        dog.eat();    // Output: Dog eat

        // Calling static method from the Animal interface
        Animal.speak();  // Output: The animal is speaking

       dog.run();
    }
}
