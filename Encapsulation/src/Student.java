public class Student {
//fields behaviour

    private String name;
    private int rollnumber;
   private int age;

//   we can ovverload  default construer like bellow to fill with roll 19 as we are not seeting it up
//   public Student( ) {
//       this.rollnumber=19;
//   }

//HERE IS PARMATER CONSTRUCTOR
   public Student(String name, int rollnumber, int age) {
       this.name = name;
       this.rollnumber = rollnumber;
       this.age = age;
   }
    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Example of validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
