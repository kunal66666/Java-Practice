package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApidemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int count=0;
        for(int i:numbers)
        {
            if(i%2==0)
                count++;
        }
        System.out.println(count);
        System.out.println(numbers.stream().filter(x->x%2==0).count());

        //TO CRATE STREAM
        //WITH COLLECTIONS WE USE COLLECTION.STREAM
        //TO CONVER ARRAY INTO STREAM

        String[] array={"a","b","c"};
        Stream<String> st1=Arrays.stream(array);
        //from stream.of

        Stream<String> st2=Stream.of("a","b");
           ///to create infinite stream
        Stream<Integer> generateinfine=Stream.generate(()->1);

        List<Integer>stream3= Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList());
          System.out.println(stream3);

// using stream  we can conver any collections intomstream to use fucntiioanl amd declerative programminh
       //FEATURES INTRODUCED IN JAVA8
       //PROCESS COLLECTIONS OF DATA IN FUNCTIONAL AND DECLERATIVE MANNER
        //EEAR;LIER USING IFELSE LOOP IT IS DNE
        //SIMPLIFY DATA PROCESSING
        //EMBRANCE FUNCTIONAL PROGRAMMING

        //IMPROVE READBILITY AND MAINTAINTIBILITY
        //ENABLE EASY PARAALESIM NO NEED OF MULTHREADING HANDLEING

        //HOW TO USE STREAMS?
        //SOURCE , INTERMEDIATE OPERATIONS & TERMINAL OPERATION


    }
}
