package multithreading;


//mutex- To protect critical sections of code where shared resources
// (like variables, files, or memory)
// are accessed, ensuring data consistency.
//When to Use Which Approach
//
//Simple synchronization (synchronized): Use when simplicity is key.
//        ReentrantLock: Use when you need advanced control like fairness or interruptible locks.
//Atomic Variables: Best for simple counters without blocking threads.
//Concurrent Collections: Use for thread-safe collection operations.
//        Semaphore: Useful for resource access control.
//        StampedLock: Ideal for read-heavy operations requiring minimal contention.
//class Counters{
//
//    public int val = 0;
//    // Synchronized method to ensure thread safetyit is like luck one thread wull lock theat can not be perfoemed concurrently
//    //we we use synchoeex method then not allow to take it
////    public synchronized void increment() {
////        val++;
////    }
//
//
//    //we can lock in both way using syncornixe block and method on method it will lock complete method
//    public void increment(){
//        synchronized(this){
//            val++;
//        }
//        //this place in called crictical section beacuse it causing the race codntion if no locks
//    }
//
//
//
//}

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;



//class Counters {
//    public int val = 0;
//    private final ReentrantLock lock = new ReentrantLock();
//    public void increment() {
//        lock.lock(); // Acquire the lock
//       try{
//           val++;
//       }catch (Exception e) {
//           System.out.println(e.getMessage());
//       }finally{
//           lock.unlock(); //always release the lock
//       }
//    }
//}


// class Counters {
//     private AtomicInteger val=new AtomicInteger(0);
//    public  void increment() {
//             val.incrementAndGet(); //thread safe
//    }
//    public  int getValue() {
//        return val.get();
//    }
//         }
//



import java.util.concurrent.Semaphore;

class Counters {
    private final Semaphore semaphore = new Semaphore(1);
    public int val = 0;

    public void increment() {
        try {
            semaphore.acquire(); // Acquire the semaphore
            val++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the semaphore
        }
    }
}

class IncrementCounter implements  Runnable{
    private final Counters counters;
    public IncrementCounter(Counters counters) {
        this.counters = counters;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counters.increment();
        }
    }
}

public class HandleRace {
    public static void main(String[] args) throws InterruptedException {
        Counters counters = new Counters();
        Runnable Task=new IncrementCounter(counters);
        Runnable Task2=new IncrementCounter(counters);
         Thread T1 = new Thread(Task);
         Thread T2 = new Thread(Task2);
         T1.start();
         T2.start();
         T1.join();
         T2.join();
        System.out.println("Final Counter Value (Expected 2000): " + counters.val);
            }
}

