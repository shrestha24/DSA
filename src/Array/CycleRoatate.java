package Array;

public class CycleRoatate {

    public void rotate(int ar[], int k){

        int n = ar.length;
         if(k==0|| k % n == 0){
             return;
         }

         swap(ar, 0, n-1);
         swap(ar, 0, k-1 );
         swap(ar, k, n-1);
    }

    public void swap(int ar[], int i , int j){

        while(i < j){
       int temp = ar[i];
       ar[i] = ar[j];
       ar[j] = temp;

       i++;
       j--;

        }
    }
}
