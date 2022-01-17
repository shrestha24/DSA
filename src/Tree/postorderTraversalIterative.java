package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class postorderTraversalIterative {
    public List<Integer> postorderTraversal(TreeNode root){
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        List<Integer> postOrderList = new LinkedList<Integer>();

        if (root == null)
            return postOrderList;

        stack1.push(root);
        while (!stack1.isEmpty()){
            root = stack1.pop();
            stack2.add(root);
            if (root.left != null)
                stack1.push(root.left);
            if (root.right != null)
                stack1.push(root.right);
        }

        while (!stack2.isEmpty()){
            postOrderList.add(stack2.pop().val);
        }

        return postOrderList;
    }
}
