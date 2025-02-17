package practice;
//
//. ThreadLocal
//Purpose: Stores data that is unique to each thread, preventing race conditions in multi-threaded applications.
//Scope: The data is only available to the thread that sets it.
//Child Thread Inheritance: Not inherited by child threads.
////Common Use Cases: Storing per-thread data like user sessions, database connections, or request context.
//
//2. InheritableThreadLocal
//Purpose: Similar to ThreadLocal, but child threads inherit the value from the parent thread.
//Scope: The value set in a parent thread is available in child threads.
//Child Thread Inheritance: Inherited by child threads, but still unique to each thread.
//Common Use Cases: Passing data (like user sessions, security contexts) from a parent thread (e.g., main thread) to child threads.

public class InheritThreadLocalExample {
    static InheritableThreadLocal<String> inheritthreadLocal = new InheritableThreadLocal<>();
    public static void main(String[] args) {
         inheritthreadLocal.set("Inherit Thread");
        Thread childThread=new Thread(() -> {
            System.out.println("Child Thread (Inherited): " + inheritthreadLocal.get());
            inheritthreadLocal.set("Child Thread SET");
            System.out.println("Child Thread (Inherited): " + inheritthreadLocal.get());
        });


        childThread.start();

        // Ensuring parent thread doesn't get affected
        System.out.println("Parent Thread: " + inheritthreadLocal.get());
    }
}
