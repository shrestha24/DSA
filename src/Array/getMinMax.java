/*
package Array;


public class getMinMax {

    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int ar[], int low, int high){
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;

        if(low == high){
            minmax.max = ar[low];
            minmax.min = ar[high];
            return minmax;
        }

        if(high == low + 1){
            if(ar[low] > ar[high]){
                minmax.max = ar[low];
                minmax.min = ar[high];
            } else {
                minmax.max =ar[high];
                minmax.min = ar[low];
            }
            return minmax;
        }

        mid = (low + high) / 2;

    }

}
*/
