package practice;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Pcqueeue {

//    No manual wait() or notify() needed – put() waits if full, take() waits if empty
//🔹 More efficient – No risk of missed signals or deadlocks
//🔹 Cleaner, easier to maintain
    private final BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(1);

    public void produce(){
        try{
               int val=(int) (Math.random()*100);
               queue.put(val);
            System.out.println("Produced: " + val);
              Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void consume(){
       try{
           int val=queue.take();
           System.out.println("Consumed: " + val);
           Thread.sleep(1000);
       }catch(InterruptedException e)
       {
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        Pcqueeue pc=new Pcqueeue();
        Thread producer=new Thread(() -> {
            while(true){
                pc.produce();
            }
        });

        Thread consumer=new Thread(() -> {
            while(true){
                pc.consume();
            }
        });
        producer.start();
        consumer.start();
    }


}
