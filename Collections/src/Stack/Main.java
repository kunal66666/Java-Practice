package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>(); //stack is also synxrozined
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        int search=st.search(2);  //it will search from bottom beacsue it follows lifo  and index is 1 based
        System.out.println(search);
        System.out.println(st.size());
        System.out.println(st.peek()); //WILL NOT REMVOE JUST SHOW
        System.out.println(st.pop()); //pop will remove . is empty to check is empty . size
        System.out.println(st);
    }
}
