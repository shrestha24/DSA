package graph;

import java.util.ArrayList;
import java.util.List;

public class FindAllPathsFromSourceToTarget {
    //List of list in integer for the output
    //check graph is null or length is 0
    //df(current node, list of path, result list, graph[][] for traversal)
    //dfs function
    //add nodes to list
    //base condition - if (node == graph.length - 1)
    //for(go to neighbours)
    //list.remove list.length -1

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> masterList = new ArrayList<>();
        if (graph == null || graph.length == 0){
            return masterList;
        }

        dfs(0, new ArrayList<>(), masterList, graph);
        return masterList;
    }

    private void dfs(int node, ArrayList<Integer> list, List<List<Integer>> masterList, int[][] graph) {
        list.add(node);
        if (node == graph.length - 1){
            masterList.add(new ArrayList<>(list));
            return;
        }

        for (int neibourNode: graph[node]) {
            dfs(neibourNode, list, masterList, graph);
            list.remove(list.size() - 1);
        }



    }
}
