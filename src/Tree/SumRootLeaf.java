package Tree;

public class SumRootLeaf {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return sum;
    }

    private void dfs(TreeNode root, int currentSum) {
        if (root==null)
            return;
        currentSum=currentSum*10+root.val;
        if (isLeaf(root))
            sum+=currentSum;
        dfs(root.left,currentSum);
        dfs(root.right,currentSum);
    }
    private boolean isLeaf(TreeNode node){
        if (node.left==null&&node.right==null)
            return true;
        return false;
    }


    public int sumNumbers1(TreeNode root) {
        dfs(root,0);
        return sum;
    }
    public void dfs1(TreeNode root, int currSum){
        if(root == null)
            return;
        currSum = currSum*10+root.val;
        if(isLeaf1(root)){
            sum+= currSum;

        dfs1(root.left, currSum);
        dfs1(root.right, currSum);
        }

    }

    public boolean isLeaf1(TreeNode node){
        if(node.left == null && node.right == null){
            return true;
        }
        return false;
    }

}
