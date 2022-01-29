package Tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root){
        return (root == null || isSymmetricTree(root.left, root.right));
    }

    private boolean isSymmetricTree(TreeNode left, TreeNode right) {
        if (left == null || right == null){
            return (left == right);
        }

        if (left.val != right.val)
            return false;

        return (isSymmetricTree(left.left, right.right)
                && isSymmetricTree(left.right, right.left));
    }

}
