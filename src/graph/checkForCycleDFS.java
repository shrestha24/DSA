package graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class checkForCycleDFS {
    static  boolean checkCycle(int parent, int currentNode, ArrayList<ArrayList<Integer>> adj, boolean visited[]){

        visited[currentNode] = true;
        for (Integer it: adj.get(currentNode)
             ) {
            if (visited[it] == false){
                if (checkCycle(it, currentNode, adj, visited) == true)
                    return true;
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){

        boolean visited[] = new boolean[V+1];
        Arrays.fill(visited, false);

        for (int i = 1; i < V; i++) {
            if (visited[i] == false)
                if (checkCycle(i, -1, adj, visited))
                    return true;
        }
        return false;
    }
}
