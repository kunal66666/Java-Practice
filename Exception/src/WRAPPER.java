public class WRAPPER {

    public static void main(String[] args) {
        // Primitive type stored in stack memory
        int a = 3;
        // Here, the value 3 is stored directly in stack memory as it's a primitive type.

        // Boxing: Converting primitive type to wrapper class
        Integer b = Integer.valueOf(a);
        // Here, `b` refers to an Integer object in heap memory.

        // Unboxing: Converting wrapper class object back to primitive
        int d = b;

        // Wrapper class for boolean
        Boolean isAdult = true;
        // The primitive boolean value `true` is autoboxed into a Boolean object.

        // Printing values
        System.out.println("Primitive int: " + a);
        System.out.println("Boxed Integer: " + b);
        System.out.println("Unboxed int: " + d);
        System.out.println("Wrapper Boolean: " + isAdult);
    }
}
