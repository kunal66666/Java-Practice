package LL;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("rahul","jay","raghu"));
        list.add("a");
        list.add("b");
        list.add("c");
        String x=list.get(1);
        list.remove(x);
        list.remove("a");
        System.out.println(x);
        for(String s : list){
            System.out.println(s);
        }
        for(String s : list1){
            System.out.println(s);
        }
    }
}
