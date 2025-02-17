package java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class ConsumerDEMO {
    public static void main(String[] args) {
        //CONSUMER
//        Consumer<T> is a functional interface in java.util.function
//        that accepts a single input
//        argument but does not return any result.
//        It is mainly used to perform operations
//        like printing, logging, modifying objects,
//        and iterating over collections.
        Consumer<String>con = x -> System.out.println(x);
        con.accept("Hello World");

        List<Integer> list= Arrays.asList(1,2,3);
       Consumer<List<Integer>> PRINTIT= System.out::println;
       PRINTIT.accept(list);

       Consumer<String> touppercase=str -> System.out.println(str.toUpperCase());
       Consumer<String> tolowercase=str -> System.out.println(str.toLowerCase());
        //CHAIN CONSUMER
        Consumer<String> combinedconsumer=tolowercase.andThen(touppercase);
        combinedconsumer.accept("kunal");



        //SUPPLIER
//        Supplier<T> is a functional interface in java.util.function that does not take any input but returns a value of type T. It is mainly used for lazy initialization, fetching values, and generating data.
//        @FunctionalInterface
//        public interface Supplier<T> {
//            T get();
//        }

//        T → Return type
//        ..IT HAS ALSO SUNGLE ABSRTRACT METHOD WHICH
//        IS GET

  ///  // Supplier that generates a random number

        Supplier<Integer> randomeno= ()-> new Random().nextInt();
        System.out.println(randomeno.get());
        System.out.println(randomeno.get());


        //NOW COMBINED EXAMPLE
        Predicate<Integer> predicate=x->x%2==0;
//        Function<Integer,Integer> function=x->x*x; urinaryoperato will do same task
        UnaryOperator<Integer> function=x->x*x;
        Consumer<Integer> consumer=x->System.out.println(x);
        Supplier<Integer> supplier=()->100;

        if(predicate.test(supplier.get())){
            consumer.accept(
                    function.apply(supplier.get())
            );
        }

        //we have bipredicate to tske two argument
        BiPredicate<Integer,Integer> isumeven=(x,y)->(x+y)%2==0;
         System.out.println(isumeven.test(2,3));
         BiFunction<String,String,Integer> function2=(x,y)->(x+y).length();
         System.out.println(function2.apply("hello","world"));
         BiConsumer<String,String> function3=(x,y)->System.out.println(x+y);
          function3.accept("hellos","worlds");
    List<String> names = List.of("Alice", "Bob", "Charlie");

        // Using System.out::println as a method reference instead of lembda expression
        names.forEach(x->System.out.println(x));
        names.forEach(System.out::println);
    }
}
