package multithreading.PC;



import java.util.LinkedList;
import java.util.Queue;

// the producer-consumer queue
// both producer and consumer threads works on an object of this class
public class PcQueue {

    // the underlying data structure
    Queue<Integer> queue = new LinkedList<>();

    // capacity of queue
    // you can change this capacity to any value you want
    private int capacity = 1;

    // produce a value
    // called from producer thread
    public synchronized void produce() {
        try {
            while (queue.size() == capacity) {
                wait();
            }
            int value = (int) (Math.random() * 100);
            queue.add(value);
            System.out.println("value produced ==> " + value);

            notify();
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie.getMessage());
        }
    }

    // consume from the queue
    // called by consumer thread
    public synchronized void consume() {
        try {
            while (queue.isEmpty()) {
                wait();
            }
            while (!queue.isEmpty()) {
                int value = queue.poll();
                System.out.println("consumer consumed ==> " + value);
            }
            notify();
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie.getMessage());
        }
    }
}