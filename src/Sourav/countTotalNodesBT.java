package Sourav;

import Tree.TreeNode;

public class countTotalNodesBT {
    public static int countTotalNodes (TreeNode root){

        if (root == null){
            return 0;}

        int left = getleftTree(root);
        int right = getRightTree(root);

        if (left == right)
         return ((2<<(left)) - 1);

        else return countTotalNodes(root.left) + countTotalNodes(root.right) + 1;

    }

    public static int getleftTree(TreeNode root) {
        int count = 0;
        while (root.left != null){
            count++;
            root = root.left;
        }
        return count;
    }

    public static int getRightTree(TreeNode root) {
        int count = 0;

        while (root.right != null){
            count ++;
            root = root.right;
        }

        return count;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left=new TreeNode(2,new TreeNode(4),new TreeNode(5));
        node.right=new TreeNode(3,new TreeNode(6),new TreeNode(7));
        countTotalNodes(node);
        System.out.println(countTotalNodes(node));
    }
}
