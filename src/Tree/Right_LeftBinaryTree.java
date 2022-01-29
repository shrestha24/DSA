package Tree;

import java.util.*;

public class Right_LeftBinaryTree {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, 0, result);
        return result;
    }

    private void rightView(TreeNode root, int currDepth ,List<Integer> result) {
        if (root == null)
            return;
        if (currDepth == result.size()){
            result.add(root.val);
        }

        rightView(root.right, currDepth + 1, result);
        rightView(root.left, currDepth + 1, result);
    }

}
