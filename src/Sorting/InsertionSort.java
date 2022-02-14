package Sorting;

public class InsertionSort {
    void Insertionsort(int ar[]) {
        int n = ar.length;
        for(int i =1; i < n; i++){
            int key = ar[i];
            int j = i -1;

            while(j >= 0 && ar[j] > key){
                ar[j+1] = ar[j];
                j = j+1;
            }
            ar[j+1] = key;
        }
    }
}
