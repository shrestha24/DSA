package Tree;

import java.util.*;

public class ConstructTreeFromInorderPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      HashMap<Integer, Integer> hm = new HashMap<>();

      for(int i = 0; i < inorder.length; i++){
          hm.put(inorder[i],i);
      }

      TreeNode root = buildTREE(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, hm );
      return root;
    }

    private TreeNode buildTREE(int[] inorder, int inStart, int InEnd,
                               int[] postorder, int postStart, int postEnd, HashMap<Integer, Integer> hm) {

        if(inStart > InEnd && postStart > postEnd)
        return null;

        TreeNode root = new TreeNode(postorder[postEnd]);

        int isRoot = hm.get(root.val);
        int numsLeft = isRoot - inStart;

        root.left= buildTREE(inorder, inStart, inStart+numsLeft-1, postorder,
                postStart, postStart+numsLeft-1, hm );
        root.right = buildTREE(inorder, inStart+numsLeft+1, InEnd,
                postorder, postStart+numsLeft, postEnd-1, hm);

        return root;
    }


}
