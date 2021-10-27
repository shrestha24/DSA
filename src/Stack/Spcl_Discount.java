package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Spcl_Discount {
    //NSR
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i<prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                prices[stack.pop()]-=prices[i];


            }
            stack.push(i);

        }
        return prices;
    }

    public static void main(String[] args) {
        int ar[] = {8,4,6,2,3};
        System.out.println(finalPrices(ar));
    }


}
