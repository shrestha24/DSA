package Sorting;

public class QuickSort {
    void swap(int ar[], int i, int j){
        int temp =  ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    int partition(int ar[], int low, int high){
        int pivot = ar[high];
         int i = (low - 1);

         for(int j = low; j <=high-1; j++ ){

             if(ar[j] < pivot) {
                 i++;
                 swap(ar, i, j);
             }
         }
         swap(ar, i +1, high);
         return(i +1);
    }
}
