package Stack;

import java.util.*;

public class NGR {
    // {88, 12 , 24, 10, 14}
    // {0,  1,   2,  3,  4
    static List<Integer> ngr(int ar[]){
        Stack<Integer> st = new Stack<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = ar.length-1 ; i >=0 ; i--) {
            if (st.isEmpty()){
                list.add(-1);
            }
            else {
                while (!st.isEmpty() && ar[i] >= st.peek()){
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
        Collections.reverse(list);
       return list;
    }

    public static void main(String[] args) {
        int ar[] = {12, 34, 32, 43, 23, 24};
        //           34  43   43    -1    24      -1
        System.out.println(ngr(ar).toString());
    }
}
