package Sorting;

public class HeapSort {

    void quicksort(int[] ar, int low, int high){
        int pivot;

        if(high > low){
            pivot = Partition(ar, low, high);
            quicksort(ar, low, pivot-1);
            quicksort(ar, pivot+1, high);
        }
    }

    int Partition(int[] ar, int low, int high){
        int left = low;
        int right = high;
        int pivot = ar[low];

        while(left < right){
            while (ar[left] <= pivot)
                left++;
            while (ar[right] > pivot)
                right++;

            if(left < right)
                swap(ar, left,right);
        }
        ar[low] = ar[right];
        ar[right] = ar[pivot];
        return right;

    }

    private void swap(int[] ar, int left, int right) {
        int temp = ar[left];
        ar[left] = ar[right];
        ar[right] = temp;
    }
}
