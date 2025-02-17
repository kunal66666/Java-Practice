package ArrayList;

import java.util.*;

class StringLEngthComperator implements Comparator<String> {

//it is compareteke descding
    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}
public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        //no need to give size as in noraamal array
//   //arraylist can grow or shirnk unlik regular array
////by default intial capacity is 10 if it get full it resize to 1.5 timesm
//        //time cost in n
//
//
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//         System.out.println(arrayList.contains(4));
//         System.out.println(arrayList.remove(2));
//        System.out.println(arrayList.remove(Integer.valueOf(1)));//now directly we can remove value instead lof index
//         arrayList.set(1,4);//now replace 2
//         System.out.println(arrayList);

        List<String> list = Arrays.asList("Monda","tueesday","wedNESDAYYY");
        //this is fix size we cnanot add and remove in this list
       //though we can replace usoing set
        list.set(1,"thuRSDAAYY");
//        list.sort(new StringLEngthComperator()); we can do using lembda expressin on this fly
        list.sort((a,b)-> b.length() - a.length()); //desceding order
        System.out.println(list);
        System.out.println(list.getClass().getName());
    List<Integer> list3=List.of(1,2,3);
    //it will no able to even replace or set
    System.out.println(list3);

List<Integer> list4=new ArrayList<>();
list4.add(6);
list4.add(4);
//list4.remove(Integer.valueOf(2));
//        list4.sort(null);  //natual ordering of sorting usng null
        //we can use comperator to sort also
        //it compare two same object of same types
        //it is also funcitnal interface so we have to implemnt it compare method

        Collections.sort(list4);
System.out.println(list4);

//to convert list to array
//   list.toArray();


    }
}
