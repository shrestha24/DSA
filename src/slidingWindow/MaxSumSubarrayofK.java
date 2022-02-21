package slidingWindow;
/*
* Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
* Arr = [100, 200, 300, 400,500,600,700]
which is maximum*/
public class MaxSumSubarrayofK {

    public int getMaxSum (int ar[], int k){
        int max = Integer.MIN_VALUE;

        int n = ar.length;
        for (int i = 0; i < n - k; i++) {     //ye staring i se start hoga aye n - k tak chlaega cos jitna k ha utna tak chaiye
            int sum = 0;
            for (int j = i; j < i + k; j++) {  //j i se start hoga aur ye sum of sub array
                sum+= ar[j];                   // k consecutive no ka sum hoga
            }
            max = Math.max(max, sum );           //compare
        }
        return max;
    }
    public static int getMAxSum1(int ar[],int k){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int j=0;
        for (int i = 0; i < ar.length; i++) {
            sum+=ar[i];
            if(i>=k-1){
                max=Math.max(max,sum);
                sum=sum-ar[j];
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int ar[]={10,50,20,40,60};
        int k=2;
        System.out.println(getMAxSum1(ar,k));
    }

}
