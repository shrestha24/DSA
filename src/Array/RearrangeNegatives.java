package Array;

public class RearrangeNegatives {
    public static void swap(int ar[], int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public void rearrange(int[] ar){
        int low = 0;
        int high = ar.length - 1;
        while(low <= high)
            if(ar[low] <= 0)
                low++;
            else
                swap(ar, low, high--);
    }
}
