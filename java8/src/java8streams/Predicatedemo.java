package java8streams;


import java.util.function.Predicate;

public class Predicatedemo {

    public static void main(String[] args) {

        //lembda expression always imoplemnt fucntiinak interafce

        //predicate have abstract methd only
//        It has a test(T t) method that returns true or false.
//        t represents a boolean-valued function that takes one argument.
//        It is commonly used for filtering, conditional checks, and lambda expressions.

        //we are storing comditom is vraiblee here in iseven it is fucntioanl interface
        Predicate<Integer> isEven = x -> x % 2 == 0;
             System.out.println(isEven.test(2));
             Predicate<String> isWORDSTARTWITHa = x-> x.startsWith("A");
             Predicate<String> isWORDENDWITHA = x-> x.endsWith("T");
             Predicate<String> and = isWORDENDWITHA.and(isWORDSTARTWITHa);
        System.out.println(and.test("AnkiT"));



    }

    @FunctionalInterface
    interface  MathOperation {
        int operate(int a, int b);
    }

}
