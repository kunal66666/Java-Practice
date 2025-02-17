package java8streams;

public class Streamsdemo {
    public static void main(String[] args) {
        // streams
        //java 8 - lambda expression,streams,data and time api

//        The Stream API in Java,
//        introduced in Java 8, provides a
//        functional approach to processing
//        collections of objects. It allows for
//        operations such as filtering, mapping,
//        and reducing to be performed in a
//        declarative and concise manner
//        . A stream represents a sequence of
//        elements that supports different operations,
//        enabling the creation of pipelines
//        to query and manipulate data. Streams
//        do not modify the original data source;
//        instead, they produce a new stream
//        with the transformed data.
//        This approach promotes immutability and avoids side effects,
//        making it suitable for parallel processing


        //lambda expression mostlyu use in functional interface

        //fA functional interface in Java is an interface that contains exactly one abstract method.d
        //it is a annyous funcitin (no name , no return tyoe,no access modifer

//        Thread t1=new Thread(new Task());
        //see below we havw  to write class insteads of that we can do lembda expression
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        //this is fucntional programming
        MathOperation sumoperation = (int a, int b) -> a + b;
        System.out.println(sumoperation.operation(4, 6));
    }


//class Task implements Runnable{
//    public void run() {
//        System.out.println(Thread.currentThread().getName());
//    }
//}


//after thread ex

//see i am doing interface on the fly with lembda expression

//if it is fucntiinal interface means can have ONYL ONE METHOD THENE WE CAN
//USE LEMBDA EXPRESSION ON THE FLY
//class Sumoperartion implements MathOperation{
//
//    @Override
//    public int operation(int a, int b) {
//        return  a+b;
//    }
//}

    interface MathOperation {
        int operation(int a, int b);
    }
}