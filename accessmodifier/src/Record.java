//Definition:
//A record is a special class type introduced in Java 14 (preview) and fully released in Java 16.
//It eliminates boilerplate code by automatically generating:
//Private final fields.
//A constructor that initializes fields.
//Getter methods.
//toString(), equals(), and hashCode().
//Key Features:
//        ✅ Immutable by default – No setters, fields are final.
//        ✅ Compact syntax – Less boilerplate than regular Java classes.
//        ✅ Can implement interfaces – But cannot extend other classes.
//
//Example with Constructor Validation:

//public record Product(String name, double price) {
//    public Product {
//        if (price < 0) {
//            throw new IllegalArgumentException("Price cannot be negative");
//        }
//    }
//}
//Limitations:
//        ❌ Cannot extend other classes (implicitly final).
//        ❌ No explicit setter methods (fields are immutable).
//        ❌ No default constructor (must define all fields).
//
//When to Use Records?
//        ✔ DTOs (Data Transfer Objects)
//✔ Immutable objects
//✔ Key-value pairs (like in Maps)
//✔ Reducing boilerplate code






public class Record {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        // Accessing fields
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Using toString
        System.out.println(person);

        // Comparison using equals()
        Person person2 = new Person("Alice", 25);
        System.out.println(person.equals(person2));
    }
}
