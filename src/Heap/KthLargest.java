package Heap;

import java.util.PriorityQueue;

public class KthLargest {


    public static  int kthLargest (int[] ar, int k){
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<Integer>();

        //int  K = k;
        for (int i = 0; i < ar.length ; i++) {
            if (priorityQueue.size() == k){
                priorityQueue.offer(ar[i]);
                priorityQueue.poll();
            }
            else {
                priorityQueue.add(ar[i]);
            }
        }
        System.out.println(priorityQueue.peek());
        return priorityQueue.peek();
    }




    public static void main(String[] args) {
        int a[] = {3, 7, 4, 5, 10};
        int K = 4;
        System.out.println(kthLargest(a, K));
    }


}
