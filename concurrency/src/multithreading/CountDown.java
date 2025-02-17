

package multithreading;


import java.util.concurrent.CountDownLatch;

public class CountDown{

    public static void main(String[] args) throws Exception {
        System.out.println("starting main thread");
        CountDownLatch latch = new CountDownLatch(5);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("value: " + i);
                    latch.countDown();
                }
            }
        });

        t.start();
        latch.await();
        System.out.println("main thread complete");
    }
}