package Devices;

interface A {
    void method();
}

interface B {
    void method();
}

class C implements A, B {
    @Override
    public void method() {
        System.out.println("Class C method");
    }
}

public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.method();  // Output: Class C method
    }
}

//
//class A {
//    void method() {
//        System.out.println("Class A method");
//    }
//}
//
//class B {
//    void method() {
//        System.out.println("Class B method");
//    }
//}
//
//class C extends A, B {  // This is not allowed in Java
//    void method() {
//        // Which method should it inherit from A or B?
//    }
//}
//The diamond problem arises when a class inherits from two classes that have methods with the same name and signature.
//In your example, both class A and class B have a method named method(). When class C tries to inherit from both A and B, it runs into a conflict.
//Java doesn't know which version of the method() should be inherited: from class A or from class B.