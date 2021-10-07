package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NGL {
    //Nearest Greatest Left
    static List<Integer> ngl(int ar[]){
        Stack<Integer> st = new Stack<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < ar.length; i++) {
            if (st.isEmpty()){
                list.add(-1);
            }
            else {
                while (!st.isEmpty() && ar[i] >= st.peek()){
                    st.pop(); }

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
        //    o/t:  -1, -1, 34, -1, 43, 43
        System.out.println(ngl(ar).toString());
    }

}
              //12 34 32 43 23 24
              //-1 -1 34 -1 43 43