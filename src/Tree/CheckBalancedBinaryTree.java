package Tree;

public class CheckBalancedBinaryTree {
    public boolean isBalanced(TreeNode root){
        return dfsHeight (root) != -1;
    }

    int dfsHeight (TreeNode root) {
        if (root == null)
            return 0;

        int leftheight = dfsHeight(root.left);
        if (leftheight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftheight - rightHeight) > 1) return -1;
        return Math.max(leftheight, rightHeight) + 1;
    }
}

       //







