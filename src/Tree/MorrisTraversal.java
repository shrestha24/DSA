package Tree;

import java.util.*;

public class MorrisTraversal {
    List<Integer> getInorder(TreeNode node){
        List<Integer> list = new ArrayList<>();
        if(node == null) {
            return list;
        }

        TreeNode curr = node;
        while(curr!=null){
            if(curr.left == null){
                list.add(curr.val);
                curr = curr.right;
            }
            else{
                TreeNode prev = curr.left;
                while(prev.right!=null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right==null){
                    prev.right = curr;
                    curr = curr.left;
                }
                else{
                    prev.right = null;
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return list;
    }

}
