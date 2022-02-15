package BinarySearch;

public class ReverseBinarySearch {
   public int reverseBinarySearch(int ar[], int n, int key){

      int start = 0;
      int end = ar.length;
      while (start <= end){
         int mid = start+(end-start)/2;

         if(ar[mid] == key) {
            return ar[mid];
         }
       else if(ar[mid] > key) {
            start = mid + 1;
         }
          else{
               end = mid -1;
            }
      }
      return -1;
   }
}
