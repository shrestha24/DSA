package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class  Node{
    int first;
    int second;
     public Node(int first, int second){
         this.first = first;
         this.second = second;
     }
}
public class checkForCycles {
    static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int node, boolean visited[]){

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(node, -1));
        visited[node] = true;

        while (!queue.isEmpty()){
            int currentnode = queue.peek().first;
            int parameter = queue.peek().second;

            queue.remove();

            for (Integer it: adj.get(currentnode)) {
                if (visited[it] == false) {
                   queue.add(new Node(it, currentnode));
                   visited[it] = true;
                }
                else if (parameter != it)
                    return true;
            }

        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean visited[] = new boolean[V + 1];
        Arrays.fill(visited, false);


        for (int i = 1; i < V; i++) {
            if (visited[i] == false)
                if (checkForCycle(adj, i, visited))
                    return true;
        }
        return false;
    }


}
