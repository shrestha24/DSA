package priorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthClosestElement {

    class Node{
        int diff;
        int value;

        public Node(int value, int x){
            this.value = value;
            this.diff = Math.abs(value - x);
        }
    }

    ArrayList<Integer> al = new ArrayList();
    public ArrayList<Integer> getKthClosest (int arr[], int x, int k){
        PriorityQueue<Node> pq = new PriorityQueue(new Comparator<Node>(){
            @Override
            public int compare(Node o1, Node o2){
                return (o1.diff -o2.diff); }
        });

        for(int i = 0; i < arr.length; i++){
            pq.offer(new Node(arr[i], x));
        }

        while(al.size() - 1 != k){
            al.add(pq.poll().value);
        }
        return al;
    }
}
