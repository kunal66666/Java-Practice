package multithreading;

import java.util.concurrent.CyclicBarrier;

public class Barrier {
    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier barrier = new CyclicBarrier(2,()->{
            System.out.println("Both task done main thread resumes");
        });

        for(int i=1;i<=2;i++)
        {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" Task completed by ");
                try{
                    barrier.await();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();

        }
        Thread.sleep(2000);
        System.out.println("\n🔄 Reusing CyclicBarrier for the next set of tasks!\n");
        for(int i=1;i<=2;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" Task completed by ");
                try {
                    barrier.await();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
