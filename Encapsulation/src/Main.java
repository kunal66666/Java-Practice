public class Main {
    public static void main(String[] args) {

        //if we need to initial object at time of create then we can user paramteroze construer
//       Student student = new Student();
        Student student = new Student("ram",12,14);
//        student.name="Ram";
//        student.age=15;
//        System.out.println(student.name);

//        student.setName("Ram");
//        student.setAge(15);

        // Retrieve and print the values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student roll: " + student.getRollnumber());
    }
}