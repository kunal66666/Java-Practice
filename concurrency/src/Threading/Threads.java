package Threading;

class Threads implements Runnable {
    private Counter counter;
    public Threads(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

//
//public class MyThread extends Thread {
//    private Counter counter;
//
//    public MyThread(Counter counter) {
//        this.counter = counter;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            counter.increment();
//        }
//    }
//}

//Counter counter = new Counter();
//MyThread t1 = new MyThread(counter);
//MyThread t2 = new MyThread(counter);