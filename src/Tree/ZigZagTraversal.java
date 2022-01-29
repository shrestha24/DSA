package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class  ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
       Queue<TreeNode> queue = new LinkedList<>();
       List<List<Integer>> masterList = new ArrayList<>();

       if (root == null)
           return masterList;

       queue.offer(root);
       boolean flag = true;
       while (!queue.isEmpty()){
          int levelSize =queue.size();
          List<Integer> sublist = new ArrayList<>();
           for (int i = 0; i < levelSize; i++) {
               TreeNode node = queue.poll();

               if (flag){
                   sublist.add(node.val);
               }
               else {
                   sublist.add(0,node.val);
               }

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
           }
           masterList.add(sublist);
           flag = !flag;
       }
       return masterList;
    }

}
