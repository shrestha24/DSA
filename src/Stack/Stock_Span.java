package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stock_Span {
    // NGL index
    //Find the consecutive equal or less stocks
    // {100, 80, 60, 70, 60, 75, 85 }
    //    1,  1,  1,  2, 1,  4,   6

    static List<Integer> stock_span(int ar[]){
        List<Integer> list = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < ar.length; i++) {
            if (st.isEmpty()){
                list.add(1);
            }
            else {
                while (!st.isEmpty() && ar[i]>= ar[st.peek()]){
                    st.pop();
                }
                if (st.isEmpty()){
                    list.add(1);
                }
                else {
                    list.add(i - st.peek());
                }
            }


            st.push(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int ar[] = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(stock_span(ar));
    }

}
