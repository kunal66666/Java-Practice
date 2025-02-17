package INNER;

public class Computer {
    private String name;
    private String model;
    private OperatingSystem operatingSystem;

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public Computer(String name, String model, String operatingSystem) {
        this.name = name;
        this.model = model;
//        this.operatingSystem = operatingSystem;
          this.operatingSystem = new OperatingSystem(operatingSystem);
    }

    // Correction: Remove () after OperatingSystem class definition
  class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayinfo() {
            // Correction: Use 'this.model' will cause error as inner class can't directly access outer class non-static members
            System.out.println("COMPUTER MODEL: " + name + " OS Name: " + osName);
        }
    }

    public static void main(String[] args) {

        Computer computer = new Computer("Dell", "Inspiron", "linux");
        computer.getOperatingSystem().displayinfo();

    }
}