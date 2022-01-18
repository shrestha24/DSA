package Tree;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree (TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];

    }

    private int height(TreeNode node, int[] diameter){
        if (node == null){
            return 0;
        }
        int left_tree = height(node.left, diameter);
        int right_tree =  height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], left_tree + right_tree);
        return 1 + Math.max(left_tree, right_tree);
    }


}
