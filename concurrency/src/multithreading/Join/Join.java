package multithreading.Join;


// This class is the starting point to show join() method functionality
// run this main method to see it in action
public class Join {

    // main method - jvm calls this method
    public static void main(String[] args) throws InterruptedException {
        // create two threads
        // one thread -- find out prime numbers between 1 and 100
        // second thread -- find out prime numbers between 1 and 1000
        PrimeNumbersRunnable one = new PrimeNumbersRunnable(1, 100);
        PrimeNumbersRunnable two = new PrimeNumbersRunnable(1, 1000);

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        System.out.println("Program complete");
    }
}