import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// ArrayList list=new ArrayList();
// list.add("hello");
// list.add(123);
// list.add(1.4);
// // this is list which can contans object type value , all clss extends to object
//    String str= (String) list.get(0);
//        // wehvat to type case it to use it  as string
//    Object o=list.get(0);
//
//    System.out.println(o);

    //so to over come java genrics is introduced in 5.0
//we can only stor4 string type hete
   //now type safty
        //at compile time checking
        ArrayList<String> lisst=new ArrayList<>();
        lisst.add("world");
        lisst.add(String.valueOf(3));
        for(String e:lisst){
            System.out.println(e);
        }
    }
}