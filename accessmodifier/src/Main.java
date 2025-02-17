
public class Main {
    public static void main(String[] args) {
        // Calling getInstance multiple times returns the same instance
        School school1 = School.getInstance();
        School school2 = School.getInstance();

        // Verify that both references point to the same instance
        System.out.println("Are both instances the same? " + (school1 == school2));
    }
}
