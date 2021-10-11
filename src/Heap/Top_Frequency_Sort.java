package Heap;

import java.util.*;

public class Top_Frequency_Sort {
    static class FrequentObject{
      int num;
      int count;

       public FrequentObject(int num, int count) {
          this.num = num;
          this.count = count;
       }
    }
   public static int[] top_sort (int num[], int k){
      if (num.length < k){
         return null;
      }

      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for (int i = 0; i < num.length; i++) {
         hashMap.put(num[i], hashMap.getOrDefault(num[i], 0) + 1);
      }

      PriorityQueue<FrequentObject> pq = new PriorityQueue<>(new Comparator<FrequentObject>() {
         @Override
         public int compare(FrequentObject o1, FrequentObject o2) {
            int x = o1.count - o2.count;
            return x==0? o2.num- o1.num : x;
         }
      });

      for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
         pq.add(new FrequentObject(entry.getKey(), entry.getValue()));
      }

      int a = 0;
      for (int i = 0; i < hashMap.size(); i++) {
         FrequentObject object = pq.poll();
         for (int j = 0; j < object.count; j++) {
            num[a++] = object.num;
         }
      }
      return num;
    }

   public static void main(String[] args) {
      int ar[] ={1, 2, 1, 2, 2, 3};
      System.out.println(Arrays.toString(ar));

      System.out.println(Arrays.toString(top_sort(ar, ar.length)));
   }
}
