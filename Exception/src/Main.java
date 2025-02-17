
//every class internally extends object
//object-throwable
//exception & error are chidld of throwable
// exceptoom are two types checked and unchecked

//checked example io or complie time exception or classs nout found exception , sql excvdeption

//uncheked exception runtime or null pointer exceptiom , arthmetic excveption

//error like virtual machine rror
//assertiomn error
//Errors represent irrecoverable
//conditions such as Java virtual
//machine (JVM) running out of memory,
//        memory leaks, stack overflow
//errors, library incompatibility,
//        infinite recursion, etc.
//Errors are usually beyond the
//control of the programmer, and we
//should not try to handle errors.
//EXCEPTION IS A EVENT THAT DISRUPT NORMAL FLOW OF A PROGRAM
public class Main {
    public static void main(String[] args) {

        int[] numeratorrs={10,2000,30,40};
        int [] denominatorrs={2,3,0,5};
        for(int i=0;i<numeratorrs.length;i++) {
            System.out.println(divide(numeratorrs[i],denominatorrs[i]));
        }
    }
    public static int divide(int a, int b) {
        try{
            return a/b;
        }
        catch(ArithmeticException e){
//            e.printStackTrace();
            System.out.println(e.toString());
            return -1;
        }finally {
            System.out.println("hello");
        }

    }
}

