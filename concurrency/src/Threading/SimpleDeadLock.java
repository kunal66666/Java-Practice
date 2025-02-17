package Threading;

public class SimpleDeadLock {
    public static void main(String[] args) {
        // Create two objects to lock
        Object lock1 = new Object();
        Object lock2 = new Object();

        // First thread
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 and lock 2");
                }
            }
        });

        // Second thread
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 1 and lock 2");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

//to prvent deadlock  Use a Consistent Lock Order
//
//Thread thread1 = new Thread(() -> {
//    synchronized (lock1) {
//        System.out.println("Thread 1: Holding lock 1...");
//        try { Thread.sleep(100); } catch (InterruptedException e) {}
//
//        synchronized (lock2) {
//            System.out.println("Thread 1: Holding lock 1 and lock 2");
//        }
//    }
//});
//
//Thread thread2 = new Thread(() -> {
//    synchronized (lock1) {  // Change: Acquiring lock1 first, just like thread1
//        System.out.println("Thread 2: Holding lock 1...");
//        try { Thread.sleep(100); } catch (InterruptedException e) {}
//
//        synchronized (lock2) {
//            System.out.println("Thread 2: Holding lock 1 and lock 2");
//        }
//    }
//});
