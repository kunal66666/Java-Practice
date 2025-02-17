package practice;

import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Callable task executed";
    }
}

public class CallableEx { // Renamed the class to avoid conflict
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new MyCallable());
        System.out.println(future.get()); // Retrieves result
        executor.shutdown();
    }
}
