package BinarySearchTree;

import Tree.TreeNode;

import java.util.*;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    public boolean isValid(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        } else if ((max != null && root.val >= max)||(min != null && root.val <= min)) {
            return false;
        }else{
            return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
        }
    }


    public boolean isValidBST1(TreeNode root){
        return isValid(root, null, null);

    }

    public boolean isValid1(TreeNode root, Integer min, Integer max){
        if(root == null)
            return true;

        else if((max != null && root.val >= max) || (min != null && root.val <= min)){
            return false;
        }
        else {
           return isValid1(root.left, min, root.val) && isValid1(root.right, root.val, max);
        }
    }
}
