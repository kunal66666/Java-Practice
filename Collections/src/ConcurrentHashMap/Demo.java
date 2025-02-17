package ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class Demo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        //java 7 -- segment based locking -> 16 segments --> smaller hashmaps
        //red op not need lock
// from java 8 no segementation
// it used compare and swap approach - no locking exception resizing or collisiom

        // Thread a   last saw---> x=42
        //thread a work ---> x to50
        //if x is still 42 ,then chnage in to 50 else if it chnages then dont chnage and retry
        //put -> index

        //it is threadsafe

        //if we need to store key in sorted amnner and also thread safe
        ///then that is concurrentskiplistmap
        //it used data strcutre in skiplist




    }
}
