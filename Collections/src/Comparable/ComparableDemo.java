package Comparable;

import java.util.ArrayList;
import java.util.List;

//COMPERATOR ARE USE WHEN WE DEFINE OUR OWN CUSTOM LOGIC
//FOR COMPARING UNLIKE NATURAL ORDER
//SEE IN TEST.JAVA OF ARRAYLIST PACKAGE

//COMPARABLE IS USED USING NATURAL WAY IN CLSSS ITSELF SEE IN STUDENT CLASS

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("charlie",3.5));
        list.add(new Student("david",2.5));
        list.add(new Student("alice",1.5));
        list.add(new Student("ganesh",2.5));
        list.sort(null);
        System.out.println(list);
    }
}
