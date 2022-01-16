package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class preOrderTraversalIterative {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> preorderList = new LinkedList<>();
        if (root == null)
            return preorderList;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        preorderList.add(root.val);
        while (!stack.isEmpty()){
            root = stack.pop();
            if (root.right != null){
                stack.push(root.right);
            }
            if (root.left != null){
                stack.push(root.left);
            }
        }
        return preorderList;
    }
}
