package Threading;
//
//public class BankAccount {
//    private int balance = 100;
////if we sycnhonized it to make it  free of race codniton
//    //even though it sleeps fot sometime it stopping the other thread to enter
//    public synchronized void withdraw(int amount) {
//        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
//
//        if (balance >= amount) {
//            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
//            try {
//                Thread.sleep(3000); // Simulate processing time
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            balance -= amount;
//            System.out.println(Thread.currentThread().getName() + " completed withdrawal, remaining balance: " + balance);
//        } else {
//            System.out.println(Thread.currentThread().getName() + " insufficient balance");
//        }
//    }
//}



import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000); // Simulate time taken to process the withdrawal
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}