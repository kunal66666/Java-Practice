package Vector;

import java.util.Vector;

//concurrency issue because ArrayList is not thread-safe. When two threads (t1 and t2) simultaneously modify the li/st, race conditions occur, leading to data corruption or incorrect
public class Test2 {
    public static void main(String[] args) {


        Vector<Integer> arr=new Vector<>(); //it is thread safe
//        ArrayList<Integer> arr=new ArrayList<>();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++)
            {
                arr.add(i);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                arr.add(i);
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(arr.size());
    }
}
