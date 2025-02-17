package multithreading;

//
//public class SleepvsLatch  {
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Starting tasks...");
//
//        new Thread(() -> {
//            System.out.println("Worker 1 started...");
//            try { Thread.sleep(2000); } catch (InterruptedException e) { }
//            System.out.println("Worker 1 finished.");
//        }).start();
//
//        new Thread(() -> {
//            System.out.println("Worker 2 started...");
//            try { Thread.sleep(3000); } catch (InterruptedException e) { }
//            System.out.println("Worker 2 finished.");
//        }).start();
//
//        Thread.sleep(5000); // Main thread waits (fixed time, inefficient)
//        System.out.println("Main thread resumes.");
//    }
//}
//Problem:
//
//Even if workers finish early, Thread.sleep(5000) still blocks the main thread.
//Inefficient, wastes time waiting unnecessarily.



//import java.util.concurrent.CountDownLatch;
//
//public class SleepvsLatch{
//    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch latch = new CountDownLatch(2); // Two workers
//
//        System.out.println("Starting tasks...");
//
//        new Thread(() -> {
//            System.out.println("Worker 1 started...");
//            try { Thread.sleep(2000); } catch (InterruptedException e) { }
//            System.out.println("Worker 1 finished.");
//            latch.countDown(); // Decrease count
//        }).start();
//
//        new Thread(() -> {
//            System.out.println("Worker 2 started...");
//            try { Thread.sleep(3000); } catch (InterruptedException e) { }
//            System.out.println("Worker 2 finished.");
//            latch.countDown(); // Decrease count
//        }).start();
//
//        latch.await(); // Main thread waits until countDown() is called twice
//        System.out.println("Main thread resumes.");
//    }
//}
//✔ Main thread does NOT wait unnecessarily.
//        ✔ Once all tasks finish, it proceeds immediately.

//🔹 Use Thread.sleep() when you just want a delay, like pausing execution.
//        🔹 Use CountDownLatch when you want multiple threads to finish before proceeding.



//Why Does CountDownLatch Need a New Instance for Reuse?
//CountDownLatch is a one-time use synchronization mechanism because once its count reaches 0, it cannot be reset. If you want to reuse it, you must create a new instance.

//import java.util.concurrent.CountDownLatch;
//
//public class CountDownLatchReuseIssue {
//    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch latch = new CountDownLatch(2); // Initial count = 2
//
//        for (int i = 1; i <= 2; i++) {
//            new Thread(() -> {
//                System.out.println("Task completed");
//                latch.countDown(); // Decrease count
//            }).start();
//        }
//
//        latch.await(); // Wait for both tasks to finish
//        System.out.println("Main thread resumes");
//
//        latch = new CountDownLatch(2); // Trying to reuse it (New instance needed)
//
//        // ❌ Old latch is useless now, a new one is needed!
//    }
//}

//Why Does CountDownLatch Need a New Instance for Reuse?
//CountDownLatch is a one-time use synchronization mechanism because once its count reaches 0, it cannot be reset. If you want to reuse it, you must create a new instance.


//        import java.util.concurrent.CountDownLatch;
//
//public class CountDownLatchReuseIssue {
//    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch latch = new CountDownLatch(2); // Initial count = 2
//
//        for (int i = 1; i <= 2; i++) {
//            new Thread(() -> {
//                System.out.println("Task completed");
//                latch.countDown(); // Decrease count
//            }).start();
//        }
//
//        latch.await(); // Wait for both tasks to finish
//        System.out.println("Main thread resumes");
//
//        latch = new CountDownLatch(2); // Trying to reuse it (New instance needed)
//
//        // ❌ Old latch is useless now, a new one is needed!
//    }
//}
//Why Does This Happen?
//After latch.countDown() is called twice, the count reaches 0.
//        latch.await() then unblocks the main thread.
//But CountDownLatch CANNOT be reset.
//If you need another countdown, you must create a new CountDownLatch instance.

//Alternative: Use CyclicBarrier (Reusable Alternative)
//If you want something that can be reset automatically, use CyclicBarrier instead.
//
//What is CyclicBarrier?
//        CyclicBarrier is a synchronization aid that allows multiple threads to wait for each other before proceeding.
//        The barrier waits for a specified number of threads to call await() before allowing all of them to continue.
//        It resets automatically after all threads have crossed the barrier, making it reusable
import java.util.concurrent.CyclicBarrier;

public class SleepvsLatch {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads reached the barrier!"));

        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " is ready.");
                try { barrier.await(); } catch (Exception e) { }
                System.out.println(Thread.currentThread().getName() + " started.");
            }).start();
        }
    }
}



// When should you use Thread.sleep() vs CountDownLatch vs CyclicBarrier?
//Use Thread.sleep() when you only need a fixed delay (not dependent on other threads).
//Use CountDownLatch when a thread must wait until other tasks finish.
//Use CyclicBarrier when you need multiple threads to start together.

//What is the biggest limitation of CountDownLatch?
//It cannot be reset. Once countDown() reaches 0, you must create a new instance to reuse it.