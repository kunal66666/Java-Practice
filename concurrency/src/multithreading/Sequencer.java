package multithreading;

public class Sequencer implements  Runnable{
    public void run(){
        for(int i=0;i<10;i++)
        {
//                System.out.println(Thread.currentThread().getName());
                System.out.print(i+ " ");
        }
    }
}
