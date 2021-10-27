package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int[][] kclosest(int[][] ar, int k){
            PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    double dist1 = Math.sqrt(Math.pow(o1.x,2)+Math.pow(o1.y,2));
                    double dist2 = Math.sqrt(Math.pow(o2.x,2)+Math.pow(o2.y,2));
                    if (dist1>dist2){
                        return 1;
                    } else {
                    return -1;
                }
            } });
            for (int i = 0; i < ar.length; i++) {
                priorityQueue.add(new Pair(ar[i][0],ar[i][1]));
                if (priorityQueue.size()==k+1){
                    priorityQueue.poll();
                }
            }

            int size = priorityQueue.size();
            int arr[][] = new int[size][2];
            for (int i = 0; i < size; i++) {
                Pair pair = priorityQueue.poll();
                ar[i][0]=pair.x;
                ar[i][1]= pair.y;
            }
            return ar;
        }
    }
}
