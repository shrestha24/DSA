package Heap;

import java.lang.reflect.Array;
import java.util.*;

public class K_Frequent_Elements {
    public static class Pair{
        int value;
        int count;

        public Pair(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

    public static  int[] topK(int[] nums, int k) {
       if (nums.length < k){
           return null;
       }

       int ar[] = new int[k];

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.count - o2.count;
            }
        }
        );

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            pq.offer(new Pair(entry.getKey(), entry.getValue() ));
            if (pq.size() == k + 1){
                pq.poll();
            }
        }
        for (int i = k-1; i >= 0; i--) {
            ar[i] = pq.poll().value;

        }

        return ar;
    }

    public static void main(String[] args) {
        int ar[] = {1, 2, 2, 3, 3, 3 , 4, 4 , 5 , 5, 5};
        System.out.println(Arrays.toString(topK(ar, 2)));
    }
}
