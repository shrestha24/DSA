package Stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Max_Area_Histogram {

    static int maxAreaHistogram (int hist[], int n){
        Stack<Integer> st = new Stack<Integer>();
        int nsl[] = new int[n];
        int nsr[] = new int[n];

        //nsl
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()){
                nsl[i] = 1;
            }
            else {
                while (!st.isEmpty() && hist[i] >= hist[st.peek()]){
                    st.pop();
                }

                if (st.isEmpty()){
                    nsl[i] = 1;
                }

                else {
                    nsl[i] = st.peek();
                }
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(nsl));

        st.clear();

        //nsr
        for (int i = n-1; i >= 0 ; i--) {
            if (st.isEmpty()){
                nsr[i] = n;
            }
            else {
                while (!st.isEmpty() && hist[i] >= hist[st.peek()]){
                    st.pop();
                }

                if (st.isEmpty()){
                    nsr[i] = n;
                }
                else {
                    nsr[i] = st.peek();
                }
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(nsr));

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int diff = nsl[i] - nsr[i] - 1;
            int product = diff * hist[i];
            if (max < product) {
                max = product;
            }

        }
           return max;
    }

    public static void main(String[] args) {
        int ar[] = {6, 2, 5, 4, 5, 1, 6};
              //nsr 7  5  6  5  6  6, 7
        System.out.println(maxAreaHistogram(ar, ar.length));
    }
}
