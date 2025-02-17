package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //a map is an object tgat maps keys to values,it connaot contians duplicate keys and each key can have atmpost one value
        //we can think as a ditionary
        //roll-NUMBER   NAME
        //101          ALICE JoHNSOM
        //MAP DOESNOT EXTEND COLLECITONS FRAMEORK

        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"akshait");
        hashMap.put(2,"akask");
        hashMap.put(3,"ravi");
        hashMap.remove(3);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.containsValue("ravi"));
        System.out.println(hashMap.containsKey(3));

//         keyset will return key of hashamsp
        Set<Integer> key=hashMap.keySet();
        for(int i:key)
        {
            System.out.println(hashMap.get(i).toUpperCase());
        }

        //entryset map.entrySet() returns a Set<Map.Entry<K, V>>, where each element is a key-value pair (entry).

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().toUpperCase());
        }


    }

}
