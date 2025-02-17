package GenricType.qa;

//Generics in Java provide
// type safety and reusability
// by allowing a class,
// interface, or method
// to operate on different
// types while ensuring type
// safety at compile time.


//it not work with exception bevause exception happen at run time//
//and genricd are remove duing compliton also because
//Since type parameters of generics are erased at runtime,

//Key Features of Generics
//Type Safety – Ensures that only a specific type of data is used.
//Code Reusability – The same class or method can be used for different data types.
//        Compile-time Checking – Detects type-related errors at compile time rather than runtime.
//Eliminates Type Casting – No need for explicit type casting.
class Box<T> {
    private T value;
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}
//public class GenricDemo{
//    public static void main(String[] args) {
//        Box<String> box = new Box<String>();
//        box.setValue("Hello World");
//        System.out.println(box.getValue());
//
//        Box<Integer> strBox = new Box<>();
//        strBox.setValue(4);
//        System.out.println(strBox.getValue());
//
//    }
//}



//What is Type Erasure in Java Generics?

//Java generics are
// implemented using
// type erasure, which
// means that type parameters
// are removed at runtime.
// The compiler ensures type
// safety during compilation but replaces generic types with their bounds (or Object if unbounded) at runtime.

//like after typerensure it get conveted into

//class Box<T> {
//    private T value;
//
//    public void setValue(T value) { this.value = value; }
//    public T getValue() { return value; }
//}

//to
//class Box {
//    private Object value;
//
//    public void setValue(Object value) { this.value = value; }
//    public Object getValue() { return value; }
//}


//
//What are Bounded Type Parameters in Java Generics?
//Explanation:
//A bounded type parameter restricts the
// types that can be used
// as type arguments.
// This is useful when
// working with numeric
// operations or specific interfaces.


// (Upper Bound – T extends Number)

//class NumericBox <T extends Number>{
//    private T value;
//    public void setValue(T value) { // T can be Integer, Double, Float, etc.
//        this.value = value;
//    }
//    public T getValue() {
//        return value;
//    }
//}


//? this is wirld card we can use to read anytime using this


//import java.util.List;
//
//class WildcardExample {
//    // Accepts a list of any subclass of Number (e.g., Integer, Double)
//    public static void printNumbers(List<? extends Number> list) {
//        for (Number n : list) {
//            System.out.println(n);
//        }
//    }
//}



//What is a Generic Method?
//A generic method defines a type parameter inside the method signature.
//
//class Utitlity{
//    public static<T> void printarray(T[] elem){
//        for(T el: elem){
//            System.out.println(el);
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String[] strArray = {"Java", "Generics"};
//        Integer[] intArray = {1, 2, 3};
//
//        Utitlity.printarray(strArray);
//        Utitlity.printarray(intArray);
//    }
//}

//genric construor:
//a genric constructor allows type paramter specfic to the constructor


class GnericConstructor{
    private double value;
    <T extends Number> GnericConstructor(T value){
        this.value=value.doubleValue();
    }
    public void display(){
        System.out.println(value);
    }
}
//public class GenricDemo{
//    public static void main(String[] args) {
//        GnericConstructor obj1=new GnericConstructor(1.0);
//        GnericConstructor obj2=new GnericConstructor(20);
//        obj2.display();
//        obj1.display();
//    }
//}

//        ere, the constructor <T extends Number> allows only numeric types

//genric interface just like class where genric can be used


interface Container<T>{
    void add(T item);
    T retrieve();

}
class StringContainer implements Container<String> {
    private String value;
    public void add(String item){
        this.value=item;
    }
    public String retrieve(){
        return value;
    }
}

public class Main{
    public static void main(String[] args) {
        Container<String> c1=new StringContainer();
        Container<String> c2=new StringContainer();
        c1.add("hello genru");
        c2.add("world ty");
        c1.retrieve();
        System.out.println(c1.retrieve());
    }
}
//
//How does Type Erasure Affect Method Overloading?
//Explanation:
//Because type parameters are removed at runtime, methods that differ only by generic types cause a compilation error
//
//class Test {
//    public void method(List<String> list) { }
//    public void method(List<Integer> list) { } // Compilation error
//}

//beacuse while complitom genric tyoe get remove





//enerics work only with reference types not with primitive type beacuse

//Java generics use type erasure, meaning that generic type parameters are replaced with Object (or an upper bound) at runtime.
//Primitive types (int, double, etc.) are not objects and cannot be used as generic parameters.