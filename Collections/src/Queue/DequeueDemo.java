package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueDemo {
    //doubleemdedqueue
    //llow insrtion and remove of elemnt from both end
    //verstile suppport both method of queue and stack
    public static void main(String[] args) {
        Deque<Integer> deq1 = new LinkedList<Integer>();
        deq1.add(10);
        deq1.add(20);
        deq1.add(30);
        deq1.removeFirst();
        deq1.removeLast();
        System.out.println(deq1);
//BELOW IS FASTER BEAVUSE ARRAY DO CONTIGUES LOCATION
        //NO NODE IS NEED AND ALSO NO NULL REQUERED
        Deque<Integer> deq2 = new ArrayDeque<Integer>();
        deq2.add(10);
        deq2.add(20);
        deq2.add(30);
        deq2.removeFirst();
        deq2.removeLast();
        System.out.println(deq2);
    }
}
