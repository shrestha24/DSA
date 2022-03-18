package Array;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if( nums[i] != nums[correct]){
                swap(nums, i , correct);
            } else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

    private void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
