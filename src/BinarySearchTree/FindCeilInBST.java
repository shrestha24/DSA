package BinarySearchTree;

import Tree.TreeNode;

public class FindCeilInBST {
    public int Ceil(TreeNode root, int key ){
        if (root == null)
            return 0;

        int ceil = -1;

        while ( root != null) {
            if (root.val == key) {
                ceil = root.val;
                return ceil;
            }

            if (key > root.val){
                root = root.right;
            }

            else {
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }
}
