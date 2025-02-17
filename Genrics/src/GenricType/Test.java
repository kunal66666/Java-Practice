package GenricType;

public class Test {

    public static void main(String[] args) {

//        Test test = new Test();
        String [] intarry={"ram","shyam"};
//        test.printArray(intarry);
          printArray(intarry);

    }

    public static  <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
