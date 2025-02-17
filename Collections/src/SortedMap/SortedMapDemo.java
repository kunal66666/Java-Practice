package SortedMap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        //sortedmap is interfacde that exctend map and gursntees
        //that entries are sorted based on keys etiher in their natural ordering or by
        //a specific comparator

        //redblack tree used internally in tree map it is self balancing balnce tree
        SortedMap<String,Integer> sortedMap = new TreeMap<>() ;
        sortedMap.put("B", 1);
        sortedMap.put("A", 2);
        sortedMap.put("D", 3);
        sortedMap.put("C", 4);
        System.out.println(sortedMap); //IT WILL PEINR IN SORTED ORDER ON BAIS OF KEY
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap("D"));//it wll primt abc
        System.out.println(sortedMap.tailMap("C"));

//        ap extended with navigation methods
//        returning the closest
//        matches for given search targets.
//        Methods lowerEntry, floorEntry, ceilingEntry, and higherEntry return Ma
        NavigableMap<Integer,String> navigableMap = new TreeMap<>() ;
        navigableMap.put(1,"One");
        navigableMap.put(5,"five");
        navigableMap.put(3,"Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerEntry(3));
        System.out.println(navigableMap.higherEntry(3));

    }
}
