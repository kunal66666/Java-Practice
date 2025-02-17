package INNER;



//Used for:
//
//Temporary, method-specific logic
//Encapsulating complex calculations
//Creating specialized processors


//Can only be used within the method where defined
//Cannot be accessed outside the method
//Can access local variables only if they are final or effectively final
public class DataProcessor {
    public Double processData(int[] data) {
        // Local inner class for complex processing
        class DataAnalyzer {
            int calculateTotal() {
                int total = 0;
                for (int value : data) {
                    total += value;
                }
                return total;
            }

            double calculateAverage() {
                return calculateTotal() / (double) data.length;
            }
        }

        // Use local inner class
        DataAnalyzer analyzer = new DataAnalyzer();
        return analyzer.calculateAverage();
    }

    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Total: " + processor.processData(numbers));
    }
}
