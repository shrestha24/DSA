package Array;

import java.util.PriorityQueue;

public class KthSmallestElement {

    public int kthsmallest(int ar[], int k){

        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i = 0; i<ar.length; i++){
            pq.add(ar[i]);

        if(pq.size() == k+1){
            pq.poll();
        }

        }
        return pq.poll();

    }
}
