package practice;

public class ThreadLocalExample {
    static ThreadLocal<Integer> threadLocal =ThreadLocal.withInitial(()->10);
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(threadLocal.get());
            threadLocal.set(15);
            System.out.println(threadLocal.get());
        }).start();

        new Thread(()->{
            System.out.println(threadLocal.get());
            threadLocal.set(20);
            System.out.println(threadLocal.get());
        }).start();
    }
}
