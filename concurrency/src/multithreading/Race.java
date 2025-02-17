package multithreading;

class Counter {
    public int value = 0;

    public void increment() {
        value++;  // Not thread-safe
    }
}

class IncrementTask implements Runnable {
    private final Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Race {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create IncrementTask instances
        Runnable task = new IncrementTask(counter);
        Runnable task2 = new IncrementTask(counter);

        // Start threads with the tasks
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value (Expected 2000): " + counter.value);
    }
}
