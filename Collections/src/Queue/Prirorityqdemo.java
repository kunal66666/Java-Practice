package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prirorityqdemo {
    public static void main(String[] args) {
        //part of queueu interface
        //to give priorirty
        //order elemnt based on their natural ordering (for prmtive lowest first)
        //custm comperator for custimzie ordering
        //does not allo null ele,ent


        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->y-x);
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(14);
        pq.add(1);
//        System.out.println(pq.peek());
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }


    }
}
