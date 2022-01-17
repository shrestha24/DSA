package Tree;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class inorderTraversalIterative {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> inorderList = new LinkedList<Integer>();
        if (root == null)
            return inorderList;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (true){
            if (node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                if (stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                inorderList.add(node.val);
                node = node.right;
            }
        }
         return inorderList;
    }
}
