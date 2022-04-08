package ArrayNew;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int prefix[] = new int[n];
        int postfix[] = new int[n];

        Arrays.fill(prefix, 1);
        Arrays.fill(postfix, 1);

        for (int i = 0; i < n; i++) {
            if (i != 0)
                prefix[i] = prefix[i - 1] * nums[i];
            else
                prefix[i] *= nums[i];
        }

        for (int j = n - 1; j >= 0; j--) {
            if (j != n - 1)
                postfix[j] = postfix[j + 1] * nums[j];

            else
                postfix[j] = nums[j];
        }

        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res[i] = postfix[i + 1];
            } else if (i > 0 && i < n - 1) {
                res[i] = prefix[i - 1] * postfix[i + 1];
            } else {
                res[i] = prefix[i - 1];
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

}

