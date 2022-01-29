package Tree;

import Heap.K_Frequent_Elements;
import Stack.LongestValidParenthesis;

import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    TreeNode node;
    int hd;

    public Node(TreeNode _node, int _hd){
        hd = _hd;
        node = _node;
    }
}

public class TopViewTraversal {
    public static ArrayList<Integer> topView(Node root) {
      ArrayList<Integer> ans = new ArrayList<>();
      if (root == null)
          return ans;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<>
    }
}
