package BinarySearchTree;

import Tree.TreeNode;

import java.util.Stack;

public class KthSmallestElement {
    public int KthSmallestElement(TreeNode root, int k){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int curr = 0;
        while (true){
            if (node != null){
                stack.push(node);
                node = node.left;
            }
            else {
                if (stack.isEmpty()){
                    break;
                }
                node = stack.pop();

                curr++;
                if (curr ==k ) return node.val;;
                node = node.right;
            }
        }
        return -1;
    }
}
