package Tree;

import java.util.*;

public class ConstructTreeFromInorderPreOrder {
    public TreeNode buildTree(int [] preOrder, int [] inOrder){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < inOrder.length; i++ ){
            hm.put(inOrder[i],i);
        }

        TreeNode root = buildTree1(preOrder, 0, preOrder.length-1,inOrder, 0, inOrder.length-1, hm);
        return root;
    }

    private TreeNode buildTree1(int[] preOrder, int preStart, int preEnd,
                                int[] inOrder, int inStart, int inEnd, HashMap<Integer, Integer> hm) {

        if(preStart > preEnd && inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);
        int inRoot = hm.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildTree1(preOrder, preStart+1, preStart+numsLeft,
                inOrder, inStart, inRoot-1, hm);
        root.right = buildTree1(preOrder, preStart+numsLeft+1, preEnd,
                inOrder, inRoot+1, inEnd, hm);

        return root;
    }
}
