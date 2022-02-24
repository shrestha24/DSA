package Tree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (isLeaf(root) && root.val == targetSum)
            return true;

        targetSum = targetSum - root.val;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);


    }
    public boolean isLeaf(TreeNode root){
        if(root.left == null && root.right == null)
            return true;
        return false;
    }
}
