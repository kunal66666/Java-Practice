package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        for(int i: list)
//        {
//            System.out.println(i);
//        }

        //interanlly ot work as
//using itrator we can remove concrruen on fly
//        see
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int i = itr.next();
            System.out.println(i);
        }

    }
}



//
//es! When using an Iterator, you can safely remove elements on the fly without causing a ConcurrentModificationException. This is important because using a normal for-each loop (for (int i : list)) while modifying the list will cause an error.
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class IteratorDemo {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        Iterator<Integer> itr = list.iterator();
//
//        while (itr.hasNext()) {
//            int num = itr.next();
//            if (num % 2 == 0) { // Remove even numbers
//                itr.remove();  // Safe removal using Iterator
//            }
//        }
//
//        System.out.println(list); // Output: [1, 3]
//    }
//}
