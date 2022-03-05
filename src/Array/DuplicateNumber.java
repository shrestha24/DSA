package Array;

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
     cyclicSort(nums);
     for(int i = 0; i <nums.length; i++)
     if(nums[i] != i + 1){
         return nums[i];
     }
     return -1;
    }

    private void cyclicSort(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int correctIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i]<= n && nums[i] != nums[correctIndex]){
                swap(i, correctIndex, nums);
            }

            else{
                i ++;
            }
        }
    }

    private void swap(int i, int correctIndex, int[] nums) {
      int temp = nums[i];
      nums[i] = nums[correctIndex];
      nums[correctIndex] = temp;


    }

}
