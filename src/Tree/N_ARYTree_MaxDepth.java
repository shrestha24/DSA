package Tree;

import org.w3c.dom.Node;

import java.util.List;

class Node1 {
    public int val;
    public List<Node> children;

    public Node1() {}

    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class N_ARYTree_MaxDepth {
    public int maxDepth(Node1 root) {
        if (root == null) {
            return 0;
        } else {
            int max = 1;
            for (Node node1 : root.children) {
                max = Math.max(max, maxDepth((Node1) node1) + 1);
            }
            return max;
        }

    }
}
