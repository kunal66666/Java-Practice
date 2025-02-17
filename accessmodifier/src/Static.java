//Static members belong to the class, not to any object.
// this refers to the current object, and super refers to the parent object.
//  Since static members operate independently of objects, this and super cannot be used in static contexts.
//

public class Static {

    // Static variable: shared across all instances of the class
    static int count = 0;

    // Instance variable
    String name;

    // Constructor
    public Static(String name) {
        this.name = name;
        count++; // Increment static variable whenever a new object is created
    }

    // Static method: can be called without creating an instance of the class
    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    // Instance method
    public void displayName() {
        System.out.println("Name: " + name);
    }

    // Static block: runs once when the class is loaded into memory
    static {

        System.out.println("Static block executed: Class loaded.");

    }

    // Static nested class
    static class NestedStaticClass {
        // Static method in the static nested class
//        public static void showMessage() {
        public void showMessage() {
            System.out.println("This is a static nested class.");
        }
    }

    public static void main(String[] args) {
        // Accessing static method without creating an object
        Static.displayCount();


        // Call static method directly without creating an object if we chnage inner class showmessgae to static
//        Static.NestedStaticClass.showMessage();

        // Creating objects
        Static obj1 = new Static("kunal1");
        Static obj2 = new Static("kunal2");

        // Accessing instance method
        obj1.displayName();
        obj2.displayName();

        // Accessing static method again to see updated count
        Static.displayCount();

        // Using static nested class
        Static.NestedStaticClass nestedObj = new Static.NestedStaticClass();
        nestedObj.showMessage();
        System.out.println(Static.sum(4,3));
    }
    public  static int sum(int a, int b) {
        return a + b;
    }
}


//static main logic is if we use static on any member ,method ,blocks or varible or inner class
// then that is part of class instead of instance of class so need to create object