package LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>(); //this will keep in order like insertion serailly
//        HashMap<String,Integer> hm = new HashMap<>();
        //hashmap is not ordered maontiablee serially  so
        hm.put("orange",1);
        hm.put("red",2);
        hm.put("yellow",3);
        hm.put("green",4);
        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
