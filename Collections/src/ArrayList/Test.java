package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
}
public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Michael Brown", 9.9));
        students.add(new Student("Michael John", 3.3));
        students.add(new Student("Michael town", 3.5));
        students.add(new Student("Michael raj", 10.0));


        //then comparing will work first gpa qill be compare the  student name will be compare
//        students.sort(Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName));
       students.sort(Comparator.comparing(Student::getGpa).reversed());  // now in  this atudnet we want to use getgpa to know gpa and then compare so it will do this job
//        students.sort((a,b)->{
//            if(a.getGpa()<b.getGpa())
//            {
//                return 1;
//            }else{
//                return -1;
//            }
//        });
        for(Student student : students){
            System.out.println(student.getName() + "---" + student.getGpa());
        }
    }
}
