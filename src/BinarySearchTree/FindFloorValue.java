package BinarySearchTree;

import Tree.TreeNode;

public class FindFloorValue {
    public static int FindFloor(TreeNode root, int key) {
        if (root == null)
            return 0;

        int floor = 0;

        while (root != null) {
            if (key == root.val) {
                floor = root.val;

                return floor;
            }

            if (key > root.val) {
                floor = root.val;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return floor;
    }

    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        node.right = new TreeNode(3, new TreeNode(8), new TreeNode(7));
        System.out.println(FindFloor(node, 6 ));
    }
}
