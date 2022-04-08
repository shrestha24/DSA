package Array;

import java.util.Arrays;

public class SqauresOfSortedArray {
    public int[] sortedSquares(int[] nums) {

        int length = nums.length;

        for (int i = 0; i <= length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
    public int[] sortedSquares1(int[] arr){
        int i =0;
        int j = arr.length - 1;
        int[] res = new int[arr.length];
        int x = arr.length - 1;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                res[x--] = arr[i] * arr[i];
                i++;
            } else {
                res[x--] = arr[j] * arr[j];
                j--;
            }
        }

        return res;
    }
}
