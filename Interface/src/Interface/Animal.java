package Interface;

public interface Animal {
//by defualt sttaic final
    public static final int age=10;
     void sleep();
     void eat();


    // Static method in an interface (must have a body)
    static void speak() {
        System.out.println("The animal is speaking");
    }

//    default method in an interface (like run()
//    in your code) provides a default implementation
//    that can be used
//    by any class that implements the interface.
    //if we put defualt no ned to created ovveride in  all its implmenation class
    //this is useful it introduct after java 8 we can call other also use this
    default void run(){
        this.sleep();
        System.out.println("The animal is running");
    }
}
