package Array;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length>1&&nums[0]==0){
            return false;
        }
        int n= nums.length;
        boolean check[]=new boolean[n];
        check[0]=true;
        for (int i = 0; i < nums.length; i++) {
            if (check[n-1]==true){
                return true;
            }
            if (check[i]==false){
                return false;
            }
            for (int j = 1; (j <= nums[i])&&(i+j)<n; j++) {
                check[i+j]=true;
            }

        }
        return check[n-1];
    }
}
