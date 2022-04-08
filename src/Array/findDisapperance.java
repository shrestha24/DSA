package Array;

import java.util.*;

public class findDisapperance {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else i++;
        }


        List<Integer> ans = new ArrayList();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

       return ans;
    }

    private void swap(int[] ar, int i, int correctIndex) {

        int temp = ar[i];
        ar[i] = ar[correctIndex];
        ar[correctIndex] = temp;
    }

}
