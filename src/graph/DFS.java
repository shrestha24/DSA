package graph;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    public List<Integer> bfsTraversal (List<List<Integer>> adj, int V){
        boolean visited[] = new boolean[V];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]){
                dfs(i, adj, visited, list);
            }
        }
       return list;
    }

    private void dfs(int currentNode, List<List<Integer>> adj, boolean[] visited, List<Integer> list) {
        visited[currentNode] = true;
        list.add(currentNode);

        for (Integer node : adj.get(currentNode)) {
            if (!visited[node]) {
                dfs(node, adj, visited, list);
            }
        }
    }



}
