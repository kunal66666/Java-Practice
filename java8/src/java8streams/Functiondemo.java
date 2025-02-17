package java8streams;

import java.util.function.Function;

public class Functiondemo {
    public static void main(String[] args) {

//        In Java 8, Function<T, R> is a functional interface in the java.util.function package.
//        It represents a function that takes one argument and returns a result.
        //IT HABVE JUST ON METHOD APPLY
        //t-> INPUT TYPE
       // R-> RESULT TYPE
//THEN IS DEFAULT MEHTIOD NERE
        //BEACUSE ABSTARCTMETHID IS ONLY ONE WHICH IS APPLY
        Function<Integer,Integer> doubleit= x->x*2;
        Function<Integer,Integer> THRIPLEIT=x->x*3;
        Function<String,String> touppercaase= str->str.toUpperCase();
//        System.out.println(doubleit.apply(5));

        System.out.println(doubleit.andThen(THRIPLEIT).apply(5));
        System.out.println(touppercaase.apply("Hello"));

    }
}
