package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
    public static int getKthSmallest(int arr[], int k) {
        PriorityQueue<Integer> pqueue;
        pqueue = new PriorityQueue(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int i = 0; i < arr.length; i++){
            pqueue.offer(arr[i]);
            if(pqueue.size() == k + 1){
                pqueue.poll();
            }
        }

        return pqueue.peek();


    }
    public static void main(String[] args) {
        int ar[] = { 3, 7 , 4 ,10 , 5};
        System.out.println(getKthSmallest(ar, 2));
    }
}                         /*
                               see main bata rhi hun mereko jo bhi idea aa raha
                               ek priority quque banaenge
                               usme ye nos aad karenge
                               pq ha toh sort ho jaega right?
                               phir loop hoga kth element tak
                               phir return kar dena ha

                               screen share karo dekhhun ky akiye
                          */