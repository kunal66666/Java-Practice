package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    public int id;
    public String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee emp) {
        return Integer.compare(this.name.length(), emp.name.length());
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}
public class Test2{
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<Employee>();
        emp.add(new Employee(3,"Aleffffx"));
        emp.add(new Employee(1,"Bobey"));
        emp.add(new Employee(4,"Cha"));
        Collections.sort(emp);
        System.out.println(emp);

    }
}

