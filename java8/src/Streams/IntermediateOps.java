package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        //intrermodate operation use to transform a stream tk other

        List<String> list = Arrays.asList("Akshit","Akshit","ram","Ahyam","ganesh");

//         list.stream().filter(x-> x.startsWith("A")).forEach(System.out::println);

       List <String>filterstream= list.stream().filter(x-> x.startsWith("A")).collect(Collectors.toList());
       //these are lazy it not excuted until we use terminal operatiom
        //like fo each or  collectrs or like count

        System.out.println(filterstream);

        //2 map list.stream().
        //it conditoonally transfrom each element based on spcefic croteria within the stream

//      Stream<String> st=  list.stream().map(x->x.toUpperCase());
        //CAN BE USE METHORD REFENCE LIKE BELOW
        Stream<String> st=  list.stream().map(String::toUpperCase);

          st.forEach(System.out::println);

          //tosort
        Stream<String> sortedstream= list.stream().sorted();
        Stream<String> sortedstreamusingcomperator=list.stream().sorted((a,b)->a.length()-b.length());
        sortedstreamusingcomperator.forEach(System.out::println);
       //distinct
       System.out.println(list.stream().filter(x-> x.startsWith("A")).distinct().count());

       //SKIP
        Stream.iterate(1,x->x+1).skip(10).limit(100).forEach(System.out::println);

           //7 peek perform an action on each element as it is consumed.
        Stream.iterate(1,x->x+1).skip(10).limit(100).peek(System.out::println).count();

        //7 toarray
        //to convert any stram into array
        Object[] array=Stream.of(1,2,4).toArray();
        System.out.println(Stream.of(1,2,3).max((o1, o2) -> o1-o2));
//        System.out.println(Stream.of(1,2,3).max(Comparator.naturalOrder()));


        //flatten nested strutures eg list iwthinlist so that they can be possed as a stream
        //thransform and flatter lement at the same time

        List<List<String>> listoflist=Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("ornage","grapes"),
                Arrays.asList("flower","rose")
        );
        System.out.println(listoflist.get(2).get(1));  //WE HAVE DO THIS TO GET ROSE
        //SO I DONT WANT THIS I WANT LAL TO BE FLAT IN SAME SEQ AND WANT UPPERCASE
        //SO WE WILL CHANGE INTO FLARLIST
        listoflist.stream().flatMap(x->x.stream()).map(x->x.toUpperCase()).forEach(System.out::println);
        List<String>senteces=Arrays.asList("apple drink","banana shake","orange juice");

        senteces.stream().map(x->x.toUpperCase()).forEach(System.out::print);
//        senteces.stream().flatMap(sen->Arrays.stream(sen.split(""))).map(x->x.toUpperCase()).forEach(System.out::print);


        List<Integer> no=Arrays.asList(1,2,3);
       IntSummaryStatistics stats= no.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println(stats);
        //PRTITION INTO TWO GROUS BASED ON PREDICATE
        System.out.println(senteces.stream().collect(Collectors.partitioningBy(x->x.length()>11)));

        //collectiing names by length
        List<String> l1= Arrays.asList("Anna","Bob","Alexender","Barian","Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));
        //COUNTING WORD OCCURENCE
        String sentC="hello world hello world java world";
        System.out.println(
        Arrays.stream(sentC.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));

        //PART EVENAND ODD
        List<Integer> l2=Arrays.asList(1,2,3);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x->x%2==0)));

    }
}
