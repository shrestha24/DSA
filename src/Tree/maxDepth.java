package Tree;

public class maxDepth {
    public int maxDepth(TreeNode root){
        if (root == null)
            return 0;

        int left_tree = maxDepth(root.left);
        int right_tree = maxDepth(root.right);

        return 1 + Math.max(left_tree, right_tree);
    }

}
