package Heap;

import java.util.PriorityQueue;

public class KthLargest {


    public static Object kthLargest (int[] ar, int k){
        PriorityQueue priorityQueue =new PriorityQueue();
        int  K = k;
        for (int i = 0; i < ar.length ; i++) {
            if (priorityQueue.size() == k){
                priorityQueue.offer(ar[i]);
                priorityQueue.poll();
            }
            else {
                priorityQueue.add(ar[i]);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int a[] = {3, 7, 4, 5, 10};
        int K = 2;
        System.out.println(kthLargest(a, K));
    }


}
