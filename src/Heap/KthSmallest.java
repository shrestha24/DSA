package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
   static int kthsmalest (int ar[], int k){
       PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o2 - o1;
           }
       });

       for (int i = 0; i < ar.length; i++) {
           pq.offer(ar[i]);
           if (pq.size() == k + 1) {
               pq.poll();

           }

       }

       return pq.peek();
   }

    public static void main(String[] args) {
        int ar[] = { 3, 7 , 4 ,10 , 5};
        System.out.println(kthsmalest(ar, 2));
    }
}
