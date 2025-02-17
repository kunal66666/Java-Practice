package Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //it is thread safe only use if multhitraded env otheriwse overhead becise it take more processing time

        Vector<Integer>vector=new Vector<>(5,2);//it will increase capciy by 2
        //but wer dont write capcityincrment it will be double
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        //we can give intial capcotyu check capacy inrease capcity
        System.out.println(vector.capacity());
    }
}
