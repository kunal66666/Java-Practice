package Threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment() {
        writeLock.lock();
        try {
            count++;
        } finally {
            writeLock.unlock();
        }
    }

    public int getCount() {
        readLock.lock(); //multiple thread can acquire
        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter rwc = new ReadWriteCounter();

        Runnable r= new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "read"+rwc.getCount());
                }
            }
        };
        Runnable w = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    rwc.increment();
                    System.out.println(Thread.currentThread().getName()+"here icrmeent");
                }
            }
        };


        Thread t1 = new Thread(w);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t2.join();
        System.out.println("Final count: " + rwc.getCount());
    }

}