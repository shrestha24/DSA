package Tree;

class ChildrenSumParent{
    public static int isSumProperty(TreeNode root){
      int sum = checkSum(root);
      if(sum == -1)
          return 0;
          else
              return 1;
    }

    private static int checkSum(TreeNode root) {
        if(root == null)
            return 0;
        int left = checkSum(root.left);
        if(left == -1)
            return -1;
        int right = checkSum(root.right);
        if(right == -1){
            return -1;
        }
        if(left+right==root.val||left==0&&right==0)
            return root.val;

        return -1;
    }
    public static void main(String args[]){
        TreeNode node=new TreeNode(10,new TreeNode(10),null);
        System.out.println(isSumProperty(node));
    }
}