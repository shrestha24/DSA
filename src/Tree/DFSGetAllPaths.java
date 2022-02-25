package Tree;

import java.util.*;

public class DFSGetAllPaths {
    public List<List<Integer>> DFSTree(TreeNode root){
        List<List<Integer>> masterList = new ArrayList<>();
        dfs(root, new ArrayList<>(), masterList);
        return masterList;
    }

    private boolean isLeaf(TreeNode root){
        if(root.left == null && root.right == null){
            return true;}
        return false;
    }

    private void dfs(TreeNode root, List<Integer> path , List<List<Integer>> masterList) {


         if(root == null)
             return;
         path.add(root.val);
         if(isLeaf(root)){
             masterList.add(new ArrayList<> (path));}
         else{
             dfs(root.left, path, masterList);
             dfs(root.right, path, masterList);
         }
         path.remove(path.size()-1);
         return;
    }




    //////////////////////////////////////////////////////////////////







    public List<List<Integer>> DFs(TreeNode root){
        List<List<Integer>> masterList = new ArrayList<>();

        dfs1(root, new ArrayList<>(), masterList);
        return masterList;
    }

    public boolean isLeaf1(TreeNode root){
        if(root.left == null && root.right ==null )
          return true;
        return false;
    }

    private void dfs1(TreeNode root, List<Integer> path, List<List<Integer>> masterList) {

        if(root == null)
            return;

        path.add(root.val);

        if(isLeaf(root))
            masterList.add(new ArrayList<>(path));
        else {
            dfs(root.left, path, masterList);
            dfs(root.right, path, masterList);
        }

        path.remove(path.size() - 1);

    }
}
