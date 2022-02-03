package BinarySearchTree;

import Tree.TreeNode;

public class LCAinBST {
    public TreeNode LCAinBST(TreeNode root, TreeNode p, TreeNode q){
        if (root == null)
            return null;
        int curr = root.val;
        if (curr < p.val && curr < q.val){
            return LCAinBST(root.right, p, q);}

        if (curr > p.val && curr > q.val){
            return LCAinBST(root.left, p, q);
        }
        return root;
    }
}
