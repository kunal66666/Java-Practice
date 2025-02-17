package Threading;

//lifecle https://engineeringdigest.medium.com/multithreading-in-java-39f34724bbf6
//
//public class MyThread  extends Thread {
//    public void run()
//    {
//        System.out.println("MyThread is running");
//        try{
//            Thread.sleep(2000);
//        }catch(InterruptedException e)
//        {
//            System.out.println("MyThread is interrupted");
//        }
//    }
//    public static void main(String[] args) throws InterruptedException{
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState()+"--"+t1.getName());
//        t1.start();
//        System.out.println(t1.getState()+"--"+t1.getName());
//        Thread.sleep(100);
//        System.out.println(t1.getState()+"--"+t1.getName());
//        t1.join();
//        System.out.println(t1.getState()+"--"+t1.getName());
//    }
//}



//intrupt work
public class MyThread extends Thread {
    @Override
    public void run() {
     try{
         Thread.sleep(1000);System.out.println(Thread.currentThread().getName() + " is running");

     }catch(Exception e){
         System.out.println(e);
     }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
       t1.interrupt();
    }
}

//Thread.interrupt() is for stopping or signaling a thread.
//If you interrupt a sleeping thread, it wakes up immediately and throws an InterruptedException.

//interrupt(): Interrupts the thread. If the thread is blocked in a call to wait(), sleep(), or join(), it will throw an InterruptedException.