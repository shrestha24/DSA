package Array_2_0;

public class MaxConsecutiveOnes {
    static int findMaxConsecutive(int nums[]){
        int continuous = 0;
        int maximum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==1){
                continuous++;
            } else{
                continuous = 0;
            }
            maximum = Math.max(continuous, maximum);
        }
        return maximum;
    }
}
