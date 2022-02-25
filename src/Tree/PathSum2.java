package Tree;

import java.util.*;
import java.util.List;

public class PathSum2 {
    public List<List<Integer>> FindPathSum(TreeNode root, int targetSum) {
    List<List<Integer>> masterList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    dfs(root, targetSum , new ArrayList<>(), masterList);
    return masterList;
    }

    public boolean isLeaf(TreeNode root){
        if(root.left == null && root.right == null){
         return true;
        }
        return false;
    }


    private void dfs(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> masterList) {
        if(root == null)
            return;

        path.add(root.val);
        targetSum = targetSum - root.val;

        if(isLeaf(root)){

            if(targetSum == 0){
                masterList.add(new ArrayList<>(path));
            }
        } else{
            dfs(root.left, targetSum, path, masterList);
            dfs(root.right, targetSum, path, masterList);
        }

        path.remove(path.size() - 1);
        return ;



    }

}
