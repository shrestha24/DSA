package Sorting;

public class RecursiveBubbleSort {

    void recursiveBubblesort(int ar[], int n){

        if(n == 1)
            return;

        for(int i = 0; i < n-1; i++)
            if(ar[i] > ar[i+1]){

                int temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }
             recursiveBubblesort(ar, n-1);
        }

    }
