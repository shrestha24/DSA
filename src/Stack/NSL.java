package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NSL {
static List<Integer> nsl ( int ar[]){
    List<Integer> list = new ArrayList<Integer>();
    Stack<Integer> st = new Stack<Integer>();

    for (int i = 0; i < ar.length; i++) {
        if (st.isEmpty()){
            list.add(-1);
        }
        else {
            while (!st.isEmpty() && ar[i] <= st.peek()){
                st.pop();
            }
         if (st.isEmpty()){
             list.add(-1);
         }
            else {
                list.add(st.peek());
         }
        }

        st.push(ar[i]);
    }
    return list;
}

    public static void main(String[] args) {
        int ar[] = {12, 34, 32, 43, 23, 24};
        //          -1
        System.out.println(nsl(ar).toString());
    }
}
