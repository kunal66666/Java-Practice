package Threading;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                bankAccount.withdraw(50);
//            }
//        };
        Runnable runnable = () -> bankAccount.withdraw(50);

        Thread thread1 = new Thread(runnable, "THREAD 1");
        Thread thread2 = new Thread(runnable, "THREAD 2");

        thread1.start();
        thread2.start();
    }
}
