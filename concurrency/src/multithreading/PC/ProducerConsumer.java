package multithreading.PC;


// the driver program for producer consumer problem
public class ProducerConsumer {

    // main method - jvm calls this method in main thread
    public static void main(String[] args) {
        PcQueue queue = new PcQueue();

        // the producer thread
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    queue.produce();
                }
            }
        });

        // the consumer thread
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    queue.consume();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}