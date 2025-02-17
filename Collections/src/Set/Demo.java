package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class Demo {
    public static void main(String[] args) {
        //srt is colleciton that is always unique

//        map implemtaion class are sich as hashmap,linkedhashmap,treemap,enummap
        //set - implemnt class hashsrt,linkedhashset,treeset,enumset

        //THIS WILL BE ORDERED AS VLAUE IS ENTER  IF USE LINEKDHASHSET
        //SIMPLMED HASHSET DOENSOT HAVE ORDER
        // TREE SET WILL BE SORTED

        Set<String> set = new LinkedHashSet<>();
        set.add("Z");
        set.add("A");
        set.add("C");
        System.out.println(set);

        //FOR THREAD SAFE
       //we can do
//      Set<String> hs=  Collections.synchronizedSet(set);
//            now hs is sync
//but performance is low beacuse sync will block ready acces also for other

        //so we use concurrentskiplistset

Set<String> set1 = new ConcurrentSkipListSet<>();
//IT IS BUILT IN THREAD SAFE

        //WE CAN ALSO DO UNMODFIABLE SET
        Set<String> set2 = Set.of("ram","shyan");

    }
}
