package Sorting;

import java.util.Arrays;

public class RadixSort {

    void countSort(int ar[], int n, int exp){
        int output[] = new int[n];
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for(int i =0; i < n; i++)
            count[(ar[i] / exp) % 10]++;

        for(int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for(int i = n - 1; i >= 0; i--){
            output[count[(ar[i] / exp) % 10] - 1] = ar[i];
            count[(ar[i] / exp) % 10]--;
        }
        for(int i =0; i < n; i++)
            ar[i] = output[i];
    }

    void radixSort(int ar[], int n){
        int m = getMax(ar, n);

        for(int exp = 1; m / exp > 0; exp *= 10)
            countSort(ar, n, exp);
    }

    private int getMax(int ar[], int n) {
        int mx = ar[0];
        for(int i = 1; i < n; i++)
            if(ar[i] > mx)
                mx = ar[i];
        return mx;
    }
}
