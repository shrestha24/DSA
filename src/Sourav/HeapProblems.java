package Sourav;

import java.util.*;

public class HeapProblems {


    //Kth Smallest number
    // Pq definition - work
    //Comparator - min max
    //what is kth smallest
    //Brute Froce & time Complexity
    //implementing with PQ & time complexity
    static int bruteforce(int ar[],int k){
        if (k> ar.length){
            return -1;
        }
        Arrays.sort(ar);
        return ar[k-1];
        //time Complexity => O(n
    }
    // default hota ha => min heap  matlab minimum element pop karta ha

    static int solve(int ar[],int k){
        PriorityQueue<Integer> pq =new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1-o2;
            }
        });
        for (int i = 0; i < ar.length; i++) {
            pq.offer(ar[i]);
            if (pq.size()==k+1){
                System.out.println(pq.poll());
            }
        }
        List<Integer> list=new ArrayList<>();
        while (!pq.isEmpty()){
            list.add(pq.poll());
        }
        System.out.println(list);
        return 1;
    }

    public static void main(String[] args) {
        int ar[]={2,4,6,8,10,12,14,16,18};
        System.out.println(solve(ar,3));
    }

}
