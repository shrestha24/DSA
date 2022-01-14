package Tree;

import java.util.LinkedList;
import java.util.List;

public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new LinkedList<>();
        inorderTraversal(root, list);
        return list;
    }

    private void inorderTraversal(TreeNode root, List<Integer> list){
        if (root==null)
            return;
        inorderTraversal(root.left,list );
        list.add(root.val);
        inorderTraversal(root.right, list);
    }

}
