package Sorting;

public class HeapSort {
    void heapsort(int ar[]){
        int n = ar.length;

        for(int i = n / 2-1; i >= 0; i--)
            heapify(ar, n, i);

        for(int i = n-1; i > 0; i --){
            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;

            heapify(ar, i, 0);
        }
    }

    private void heapify(int[] ar, int n, int i) {

        int largest = i;
        int l = 2*i +1;
        int r = 2* i +2;

        if(l < n && ar[l] > ar[largest])
            largest = l;

        if(r < n && ar[r] > ar[largest])
            largest = r;

        if(largest != i){
            int swap = ar[i];
            ar[i] = ar[largest];
            ar[largest] = swap;

            heapify(ar, n, largest);
        }
    }


}
