package priorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SortKsortedArray {
    /*
    * so pehle ek pq banega
    * phir for loop se k elements entry karenge
    * phir ek aur list banega
    * usme samllest wala add hoga
    * phir pq se delete hoga */
    // ok paapa

    public ArrayList getKsortedArray(int ar[], int k){
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    });

        ArrayList<Integer> al = new ArrayList();

        for(int i = 0; i <ar.length; i++){
            if(i >= k) {
                pq.offer(ar[i]);
                al.add(pq.poll());
            }
            else pq.offer(ar[i]);
        }

        while(!pq.isEmpty()){
            al.add(pq.poll());
        }

        return al;

    }
}
