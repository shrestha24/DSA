package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSortBFS {
    public boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj){
        int topo[] = new int[N];
        int indegree[] = new int[N];
        for(int i = 0; i<N; i++){
            for(Integer it: adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i< N; i++){
            if (indegree[i] == 0){
                queue.offer(i);
            }
        }
        int count = 0;
        List<Integer> list = new ArrayList();
        while(!queue.isEmpty()){
            Integer node = queue.poll();
            list.add(node);
            count++;
            for(Integer it: adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    queue.add(it);
                }
            }
        }
        if(count==N)
            return false;
        System.out.println(list);
        return true;

    }
}
