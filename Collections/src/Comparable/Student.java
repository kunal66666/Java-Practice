package Comparable;

public class Student implements Comparable<Student> {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.gpa,this.gpa);
    }
}