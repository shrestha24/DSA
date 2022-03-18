package Array;

import static Array.MissingNumber.swap;

public class FirstMissingPositive {
    public  int firstMissingPositive(int[] nums) {

        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i , correct);
            }
            else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1;
    }
    public void swap(int nums[], int correctIndex, int i){

        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
