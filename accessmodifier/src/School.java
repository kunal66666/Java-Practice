public class School {

    // Static variable to hold the single instance of the class
    private static School instance;

    // Private constructor to prevent instantiation
    private School() {
        System.out.println("School instance created.");
    }

    // Public static method to provide the single instance
    public static School getInstance() {
        if (instance == null) {
                    instance = new School();

                    //it willcreating only one object of school
        }
        return instance;


//        if (instance == null) {
//            synchronized (School.class) {
//                // Second check inside synchronized block
//                if (instance == null) {
//                    instance = new School();
//                }
//            }
//        }

    }
}
