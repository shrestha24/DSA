package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    public static List<List<Integer>> findLevelOrderTraversal(TreeNode root) {
        List<List<Integer>> masterList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null)
            return masterList;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int listSize = queue.size();
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < listSize; i++) {
                TreeNode node = queue.poll();
                sublist.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            masterList.add(sublist);

        }
        return masterList;
    }

    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        node.right = new TreeNode(3, new TreeNode(6), new TreeNode(7));
        System.out.println(findLevelOrder(node));
    }

    public static List<List<Integer>> findLevelOrder(TreeNode root) {
        List<List<Integer>> masterList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null)
            return masterList;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
               if (node.left != null)
                   queue.offer(node.left);
               if (node.right != null)
                   queue.offer(node.right);
            }
            masterList.add(list);
        }

        return masterList;
    }


}


