/*
package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NGR_2 {
    public static int[] nextGreaterElements(int[] nums) {
      int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0 ; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i])
                stack.pop();

            if (!stack.isEmpty()){
                result[i] = stack.pop();
            }
            stack.push(nums[i]);
        }
        int pos = 0;
        for (int i = nums.length - 1; i >= 0 ; --i) {
            if (result[i] != Integer.MIN_VALUE)
                continue;
            while (pos < nums.length && nums[pos] <= nums[i])
                pos++;
            result[i] = pos < nums.length ? nums[pos] : -1;
        }
        return result;

    }

    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        int ar1[] = {4, 5, 3, 2, 1};

        System.out.println(nextGreaterElements(ar));
    }
}
*/
