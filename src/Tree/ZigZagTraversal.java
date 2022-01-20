package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();

        if (root == null)
            return list;

        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> sublist = new ArrayList<Integer>(levelNum);
            for (int i = 0; i < levelNum; i++) {
                int index = 1;
                if (queue.peek() != null) queue.offer(queue.peek().left);
                if (queue.peek() != null) queue.offer(queue.peek().right);
            }
            flag = !flag;
            list.add(sublist);
        }
        return list;
    }
}
