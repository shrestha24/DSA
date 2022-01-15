package Tree;

import java.util.LinkedList;
import java.util.List;

public class postorderTraversal {
    public List<Integer> postorderTraversal (TreeNode root){
        List<Integer> list = new  LinkedList<>();
        postorderTraversal(root, list);
        return list;
    }

    private void postorderTraversal (TreeNode root, List<Integer> list){
        if (root == null)
            return;
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
    }
}
