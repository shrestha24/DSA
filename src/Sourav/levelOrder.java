package Sourav;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public static List<List<Integer>> getlevelOrder (TreeNode root){
        /*create a list of lists
        * queue to BFS
        * put root node to the queue
        * while loop : while(!queue.isEmpty)
        *    n = queue.size()
        *   create a sublist
        *   for(i = 0; i < n; i++)
        *       TreeNOde node = queue.poll()
        *       sublist.add(node.val)
        *       check left and right for not null and add to queue
        *   add sublist in masterlist
        * return masterlist
        * */

        List<List<Integer>> masterlist = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null)
            return masterlist;

        queue.offer(root);

        while (!queue.isEmpty()){
            List<Integer> sublist = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                sublist.add(node.val);

                if (root.left != null){
                    queue.offer(root.left);
                }

                if (root.right != null)
                    queue.offer(root.right);
            }
            masterlist.add(sublist);
        }
        return masterlist;
    }
}
