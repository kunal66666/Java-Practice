package multithreading;

public class ReverseSequencer implements  Runnable{

    public void run(){
        for(int i=10;i>1;i--)
        {
            System.out.print(i + " ");
        }
    }
}
