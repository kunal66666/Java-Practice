import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        //a type of stream that eableds parralel procesing of element
        //allowing multiple thread to process parta of the stream simultenaosuly

        //this can signficatenyl improive performance for large dataset
        //workload is distributed accross multikple threaf

        long starttime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1,x->x+1).limit(20000).toList();
        List<Long> factlist=list.stream().map(ParallelStream::factorial).toList();
        long endtime = System.currentTimeMillis();
        System.out.printf("Sequential Time: %d ms%n", endtime - starttime);

         starttime = System.currentTimeMillis();

        List<Long> pfactlist=list.parallelStream().map(ParallelStream::factorial).toList();
         endtime = System.currentTimeMillis();
        System.out.printf("paraalele Time: %d ms%n", endtime - starttime);



        //cummaltive sum will not work in parralel stream bceia se anwer depend on other else , it ony wok perfeclty when task are independendt
       //[1,2,3,4,5] -> [1,3,6,10,15]
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        AtomicInteger sum= new AtomicInteger(0);
//        List<Integer> cummaltivsum=numbers.parallelStream().map(sum::addAndGet).toList();
        List<Integer> cummaltivsum=numbers.parallelStream().map(sum::addAndGet).sequential().toList(); // we have to use sequanetial to handle this
        System.out.println(cummaltivsum); //IT WILL GIVE WRONG ANSWER VECAUSE IT NOT INDEPENDET



    }
    public  static long factorial(int n) {
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}
