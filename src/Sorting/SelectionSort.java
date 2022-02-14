package Sorting;

public class SelectionSort {
   void sort(int ar[]){

       int n = ar.length;

       for(int i = 0; i < n - 1; i ++){
           int minValue = i;

           for(int j = i + 1; j < n; j++){
               if(ar[j] < minValue){
                   minValue = j;
               }

               //swap
               int temp = ar[minValue];
               ar[minValue] = ar[i];
               ar[i] =  temp;
           }

       }


   }
}
