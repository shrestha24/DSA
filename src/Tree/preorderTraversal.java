package Tree;

import java.util.LinkedList;
import java.util.List;

public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new LinkedList<>();
        preorderTraversal(root, list);
        return list;
    }

    private void preorderTraversal(TreeNode root, List<Integer> list){
        if (root == null)
            return;
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
    }
}
