package graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    public static int[] topologicalSort(ArrayList<ArrayList<Integer>> adj, int N){
        Stack<Integer> stack = new Stack();

        boolean visited[] = new boolean[N];
        for(int i = 0; i < N; i++){
            if(!visited[i]){
                topologicalSort1(i, visited, adj, stack);
            }
        }
        int ar[] = new int[N];
        int i = 0;
        while(!stack.isEmpty()){
            ar[i++] = stack.pop();
        }
        return ar;
    }

    private static void topologicalSort1(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack) {
        visited[node] = true;
        for(Integer it: adj.get(node)){
            if(!visited[it]){
                topologicalSort1(it, visited, adj, stack);
            }
        }
        stack.push(node);



    }
}
