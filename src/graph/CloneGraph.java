package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node){
       if (node == null)
           return null;
        HashMap<Node, Node> hashMap = new HashMap<>();
        return dfs(node, hashMap);
    }

    private Node dfs(Node node, HashMap<Node, Node> hashMap) {

        if (hashMap.containsKey(node)){
            return hashMap.get(node);}

        Node node1 = new Node(node.val);
        for (Node currnode : node.neighbors) {
            node1.neighbors.add(dfs(currnode, hashMap));
        }
        return node1;
    }
}
