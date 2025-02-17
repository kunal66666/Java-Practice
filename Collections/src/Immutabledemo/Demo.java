package Immutabledemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("one",1);
        map1.put("two",2);
        Map<String,Integer> map2= Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("three",3);
//        map1.put("three",3); we can do using this which is unnecarry someone can and changes our  map 1
        Map<String,Integer>map3  =Map.ofEntries(Map.entry("one",1),Map.entry("two",2));
        System.out.println(map3);

    }
}
