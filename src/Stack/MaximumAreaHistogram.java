package Stack;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaHistogram {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nsl[] = new int[n];
        int nsr[] = new int[n];

        //NSL
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            nsl[i] = n;
            if (stack.isEmpty()){
                stack.push(i);
            }
            else {
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                    nsl[stack.pop()] = i;
                }
                stack.push(i);
            }

        }
        stack.clear();
        System.out.println(Arrays.toString(nsl));
        for (int i = n-1; i >= 0 ; i--) {
            nsr[i] = -1;
            if(stack.isEmpty()){
                stack.push(i);
            }
            else {
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                    nsr[stack.pop()] = i;
                }
                stack.push(i);
                  }
            }


        stack.clear();
        System.out.println(Arrays.toString(nsr));


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int width = nsl[i] - nsr[i] - 1;
            int area = heights[i] * width;
            max = Math.max(max,area);
        }
        return max;

    }

    public static void main(String[] args) {
        int ar[]= {0, 9};
        System.out.println(largestRectangleArea(ar));
    }
}
