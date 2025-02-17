package multithreading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

public class SUM {

    public static AtomicLong sum = new AtomicLong(0);

    public static void main(String[] args) throws InterruptedException {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10000000; i++)
            nums.add(rand.nextInt());

        long start2 = System.currentTimeMillis();
        seqSum(nums);
        long end2 = System.currentTimeMillis();
        System.out.println("Sequential sum time: " + (end2 - start2) + " ms");

        long start1 = System.currentTimeMillis();
        concurrentSum(nums);
        long end1 = System.currentTimeMillis();
        System.out.println("Concurrent sum time: " + (end1 - start1) + " ms");

        System.out.println("Concurrent sum result: " + sum.get());
    }

    public static void seqSum(List<Integer> nums) {
        long ans = 0;
        for (int i = 0; i < 10000000; i++)
            ans += nums.get(i);
        System.out.println("Sequential sum result: " + ans);
    }

    public static void concurrentSum(List<Integer> nums) throws InterruptedException {
        int size = 10000000 / 4;
        Thread t1 = new Thread(new Worker(nums, 0, size - 1));
        Thread t2 = new Thread(new Worker(nums, size, 2 * size - 1));
        Thread t3 = new Thread(new Worker(nums, 2 * size, 3 * size - 1));
        Thread t4 = new Thread(new Worker(nums, 3 * size, 4 * size - 1));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}
