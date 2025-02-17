package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3);
  //collectos is one terminal ops
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        //for each

//        list.stream().forEach(System.out::println);

     //reduce :combines elemnt to pridcuer a single elemnt

//     list.stream().reduce((x,y)->x+y);
   Optional<Integer> op= list.stream().reduce(Integer::sum);
    System.out.println(op.get());

    //4 count
     //55 anymatch nonematch

    boolean b= list.stream().anyMatch(x-> x%2==0);
 System.out.println(b);
    boolean b1= list.stream().allMatch(x-> x%2==0);
    System.out.println(b1);

    boolean b2= list.stream().noneMatch(x-> x%7==0);
    System.out.println(b2);
   System.out.println(list.stream().findAny().get());

   List<String> names=Arrays.asList("Anna","Bob","Charlier","David");
    //ex1
     names.stream().filter(x->x.length()>3).forEach(System.out::println);
//EX2 SQUARE AND SORT
        List<Integer> numbers=Arrays.asList(1,5,3);
        numbers.stream().map(x->x*x).sorted().forEach(System.out::println);
//summing vakues

        List<Integer> number=Arrays.asList(1,5,3);
        numbers.stream().reduce(Integer::sum).ifPresent(System.out::println);

//counting ocurence of charctaer
        String sentence="Hello world";
         // here .char output stream
      System.out.println(sentence.chars().filter(x->x=='l').count());




    }
}
