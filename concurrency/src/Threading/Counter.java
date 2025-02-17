package Threading;

public class Counter {
    private int count=0;

//    public synchronized void increment() {
//        count++;
//    }
    public void increment() {
        synchronized (this) {
            count++;
        }
    }
//    public void increment() {
//        count++;
//    }
    public int getCount() {
        return count;
    }


}
