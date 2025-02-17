package Queue;

import java.util.LinkedList;

public class Demo {
    //eleement arre added at endd and remove from front
    //fifo

    public static void main(String[] args) {
//        linkedlist can act as both stack and quuee

        //stack
        LinkedList<Integer> list=new LinkedList<>();
//        list.addFirst(3);
//        list.addFirst(5);
//        list.addFirst(7);
//        list.removeFirst(); //we are doing pop last in first out 7 will be out
//
//        System.out.println(list);

//        if we do asddlist then it will wor as ququ

          list.addLast(4);
          list.addLast(5);
          list.addLast(6);
          list.removeFirst(); //this fi fo
          System.out.println(list);
    }
}
