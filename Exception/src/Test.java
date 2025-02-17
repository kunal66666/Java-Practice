// Define a custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Call the constructor of the parent Exception class
    }
}

// Test class to demonstrate the custom exception


//throw -Used to throw an exception excepitomaly inside method body

//throws Declares potential exceptions
//gernally in method signature
//throanle is root class
public class Test {

    // Method to validate age using the custom exception
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
        }
        System.out.println("Age " + age + " is valid for registration.");
    }

    public static void main(String[] args) {
        Test test = new Test();

        try {
            System.out.println("Validating age...");
            test.validateAge(16); // This will throw the custom exception
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            System.out.println("\nValidating age again...");
            test.validateAge(20); // This will pass the validation
        } catch (InvalidAgeException e) {
            // This block won't execute in this case
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}


//
//import java.io.*;
//
//public class Test {
//
//    // Method that declares a checked exception using `throws`
//    public void readFile(String filePath) throws IOException {
//        if (filePath == null || filePath.isEmpty()) {
//            throw new IOException("File path cannot be null or empty.");
//        }
//
//        // Simulating file reading (without actual file access for simplicity)
//        System.out.println("Reading file: " + filePath);
//    }
//
//    // Main method
//    public static void main(String[] args) {
//        Test test = new Test();
//
//        try {
//            // Calling the method with a valid file path
//            test.readFile("example.txt");
//
//            // Calling the method with an invalid file path
//            test.readFile("");
//        } catch (IOException e) {
//            // Handling the IOException thrown by the readFile method
//            System.out.println("Caught Exception: " + e.getMessage());
//        }
//    }
//}
