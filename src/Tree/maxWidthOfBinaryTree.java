package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode _node, int _num) {
        num = _num;
        node = _node;
    }
}

public class maxWidthOfBinaryTree {
    public int widthOfBinaryTree (TreeNode root){
        if (root == null) return 0;
        int ans = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));
        while (!queue.isEmpty()){
            int size = queue.size();
            int min = queue.peek().num;
            int first =
        }


    }

}
