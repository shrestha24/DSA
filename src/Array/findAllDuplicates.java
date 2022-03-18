package Array;

import java.util.ArrayList;
import java.util.List;

import static Array.MissingNumber.swap;

public class findAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index =0; index < nums.length; index++){
            if(nums[index] != index+1) {
                ans.add(nums[index]);
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
