package BinarySearchTree;

import Tree.TreeNode;

public class searchBST {
    public TreeNode searchBST(TreeNode root, int value){
        while (root != null && root.val != value){
            root = value < root.val? root.left: root.right;
        }
        return root;
    }
}
