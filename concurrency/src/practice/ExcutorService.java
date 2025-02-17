package practice;




import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads

        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            Runnable task = () -> System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread().getName());
            executor.submit(task); // Submitting multiple tasks
        }

//        ExecutorService is part of java.util.concurrent and is used to
//        manage multiple threads efficiently. Instead of creating and managing
//        threads manually, it provides a pool of threads that can execute tasks
//        asynchronously.


//        Since you have a fixed thread pool of 3, the tasks will be executed in parallel by different threads (pool-1-thread-1,
//        pool-1-thread-2, and pool-1-thread-3). However, the actual assignment of tasks to threads may vary
        executor.shutdown(); // Shutdown the executor
    }
}
