package Array;

public class KadanesAlgo {
    public int kadanes(int ar[]) {
        int maxsofar = Integer.MIN_VALUE;
        int maxend = 0;
        for (int i = 0; i < ar.length; i++) {
            maxend = maxend + ar[i];
            maxsofar = Math.max(maxsofar, maxend);
            if (maxend < 0)
                maxend = 0;
        }
        return maxsofar;
    }
    public int kadane1(int a[]){
        int size=a.length;
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
   // https://leetcode.com/problems/maximum-subarray/
    public static void main(String args[]) {
        int ar[]={1,2,3,-2,5};
    }

}
