package Sorting;

public class BubbleSort {
    void sortbubble(int ar[]){

        int n = ar.length;
        boolean swamp = false;

        for(int i = 0; i < n-1; i++){
            swamp =  false;

            for(int j = 0; j < n-i-1; j ++){

                if(ar[j] > ar[j+1]){

                    //swap
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;

                    swamp = true;
                }
                if(swamp == false);
                break;
            }
        }
    }
}
