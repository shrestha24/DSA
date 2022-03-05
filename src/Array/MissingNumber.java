package Array;

import static Array.RearrangeNegatives.swap;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        cyclic(nums);
        for(int i = 0; i < n; i++){
            if(nums[i] != i)
                return i ;
        }
        return n;
    }

    public static void cyclic(int nums[]){

        int i = 0;
        int n = nums.length;
        while(i < n){
            int correctIndex = nums[i] ;
            if (correctIndex >= 0 && correctIndex < n && nums[i] != nums[correctIndex]){
                swap(nums, correctIndex, i);
            }
            else i++;
        }
    }

    public static void swap(int nums[], int correctIndex, int i){

        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
    public static void main(String[] args){
        int ar[] = {1};
 //       missingNumber(ar);
        System.out.println( missingNumber(ar));
    }
}
