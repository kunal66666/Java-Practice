package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queuedemo {
    public static void main(String[] args) {

        //QUEUE IS INTERFACE SO WE CSN DIRECLTY DO WE HAVE TO USE ITS IMPLMENTIAON CLASS
        //WHOICH IS LINKEDLIST
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);

        Queue<Integer> qu2=new ArrayBlockingQueue<>(2);
        qu2.add(3);
        qu2.add(4);
//        qu2.add(5);// it will throw excpeiton beacuse size ois 5 so we hae tp use offer so it will return false
        //offer will do error handling
        System.out.println(qu2);
    }

}
