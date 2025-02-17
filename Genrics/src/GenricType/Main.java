package GenricType;
//
//public class Main {
//    public static void main(String[] args) {
//        Box box = new Box();
//        box.setValue(1);
//        //it will throw error if we use string
////        instead of int then class cast bevause we are chnaes int into string
//    int i=(int)box.getValue();
//
//
////        String i=(String) box.getValue();
//
//        //solution is we can make box is as genric typrd
//        //it allow us to define a class ,interface or method
////        with placeholder type paramter for the data type they will work wioth
//        System.out.println(i);
//    }
//}






public class Main {
    public static void main(String[] args) {
     //it is bounded using extnda kwyqord to number tyype   Box<String> box = new Box(); //box is no type safe
//    so cna onlyl use number type
        Box<Integer> box = new Box();
        box.setValue(1);
//
////        String i=(String) box.getValue() ;//now it will throw erro at complie unlike not in above normal class
    int i = box.getValue();
        System.out.println(i);

        //another exmaple

        //using genric we can also remove duplicay of vkass
        //beacuse using genric we csn make it diffenr diffent ype
        //like fir now right we are shing string intger // we can do float string or anything
        Pair<String,Integer> pair=new Pair<>("Age",12);
        System.out.println(pair.getKey()+":"+pair.getValue());
    }
}
