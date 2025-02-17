package multithreading.Join;



import java.util.ArrayList;
import java.util.List;

// calculate prime numbers
// A single object of this class is a single unit of work to compute prime numbers
// between start and end
public class PrimeNumbersRunnable implements Runnable {

    // the start index
    private final int start;

    // the end index
    private final int end;

    // constructor - take start and end as parameters
    public PrimeNumbersRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // this method is the entry point of a thread
    @Override
    public void run() {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                primes.add(i);
            }
        }
        System.out.println("prime numbers between " + start + " and " + end + " are: " + primes);
    }

    // check if n is prime
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}