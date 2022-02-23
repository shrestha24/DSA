package Tree;

import java.util.*;

public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> masterList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)
            return masterList;

        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i <= size; i++){
                TreeNode curr = queue.poll();
                list.add(curr.val);

                if(curr.left != null)
                     queue.add(curr.left);
                if(curr.right != null)
                    queue.add(curr.right);
            }

            masterList.add(0, list);
        }
        return masterList;
    }
}
