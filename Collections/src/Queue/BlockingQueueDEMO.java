package Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0; // Initialize value

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Produced: " + value);
                queue.put(value++); // Add value to queu // Increment for next production
                Thread.sleep(500); // Simulate work
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    public void run() {
        while(true){
            try{
                Integer value=queue.take();
                System.out.println("Consumed: " + value);
                Thread.sleep(1000);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class BlockingQueueDEMO {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);

        Thread producer=new Thread(new Producer(queue));
        Thread consumer=new Thread(new Consumer(queue));
        producer.start();
        consumer.start();
        //thread safe
        //wait for queue to become nonempty /wait for space
        //simplify concurenncy like problem like producer -conscuder problem
//it have method as
        //put -> it blocks  if queue is full until space become avbl
        //take-> blocks if queu until an elemnt is aviabls
        //offer-> wait for space , up to specify time



    }
}
