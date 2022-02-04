package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    /*
    * boolean array - visited ha ki nhi T F pata chale
    * List bana na ha - graph traversal
    * for loop to visit ever node
    * if node is not visited traverse/ call bfs
    *BFS
    * Queue integer
    * offer node
    * while (!queue.isEmpty)
    * poll node
    * add node to list
    * for loop for neighbour nodes
    * if nodes not visited offer to queue
    *
    * */
    public List<Integer> bfsTraversal(List<List<Integer>> adj, int V){

        boolean visited[] = new boolean[V];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if(!visited[i]){
              bfs(i, adj, visited, list );
            }
        }
        return list;
    }

    private void bfs(int currentNode, List<List<Integer>> adj, boolean[] visited, List<Integer> list) {

        Queue<Integer> queue = new LinkedList<>();
        visited[currentNode] = true;
        queue.offer(currentNode);

        while (!queue.isEmpty()){
            int node = queue.poll();

        list.add(node);

        for(Integer it: adj.get(node)){
            if (!visited[it]){
                queue.offer(it);

                visited[it] = true;
            }
        }
        }

    }
}
