package Array;

import java.util.Arrays;

public class MergeArrays {
    public void merge(int ar[], int ar1[], int n , int m){

        int i = 0;
        while(i < n){
            if(ar[i] > ar1[i]){

                int temp = ar[i];
                ar[i] = ar1[i];
                ar[i] = temp;
            }
            i++;
        }
        Arrays.sort(ar);
        Arrays.sort(ar1);
    }
}
