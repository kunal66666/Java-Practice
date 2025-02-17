package multithreading;

import java.util.List;

public class Worker implements Runnable {

    private final List<Integer> nums;
    private final int l;
    private final int r;

    public Worker(List<Integer> nums, int l, int r) {
        this.nums = nums;
        this.l = l;
        this.r = r;
    }

    public void run() {
        long s = 0;
        for (int i = l; i <= r; i++) {
            s += nums.get(i);
        }
        SUM.sum.addAndGet(s);

    }
}
