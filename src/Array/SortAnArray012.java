package Array;

import java.util.PriorityQueue;

public class SortAnArray012 {
    public int sortArray(int ar[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < ar.length; i++){
            pq.add(ar[i]);
        }

        for(int i = 0; i < ar.length; i++){
            ar[i]= pq.poll();
        }
        return 0;
    }
}

    