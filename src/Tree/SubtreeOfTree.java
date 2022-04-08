package Tree;

public class SubtreeOfTree {
    public boolean isIdentical(TreeNode root, TreeNode subroot) {

        if(root == null && subroot == null)
            return true;


        if(root != null && subroot != null && root.val == subroot.val){
           return isIdentical(root.left , subroot.left) && isIdentical(root.right , subroot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null) return false;

        if(isIdentical(root, subRoot))
            return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }
}
