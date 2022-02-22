package Tree;

import java.util.*;

public class BoundaryTraversal {
public ArrayList<Integer> boundary(TreeNode node) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(node.val);
    getRightTraversal(node, list);
    getLeftTraversal(node, list);
    getLeafBoundary(node, list);
    return list;

}

    private void getLeafBoundary(TreeNode node, ArrayList<Integer> list) {
    if(node == null) {
        return ;}

    if(isLeaf(node)){
        list.add(node.val);
    }
    }

    private void getLeftTraversal(TreeNode node, ArrayList<Integer> list) {
    TreeNode curr = node.left;
    while(node != null){
        if(isLeaf(node) == false){
            list.add(node.val);
        }
        if(node.left != null){
            node = node.left;
        } else {
            node = node.right;
        }
    }
}

    private void getRightTraversal(TreeNode node, ArrayList<Integer> list) {
    TreeNode curr = node.right;
    ArrayList<Integer> subList = new ArrayList<>();
    while(node != null){
        if(isLeaf(node) == false){
            subList.add(0, node.val);
        }
        if(node.right != null){
            node = node.right;
        }
        else{
            node = node.left;
        }
    }
    list.addAll(subList);
    }

    public boolean isLeaf(TreeNode node){
    if(node == null) {
        return false;
    }
    return node.left == null && node.right == null;

    }

}


