/*
package Tree;

import java.util.*;



public class bottomView {
    public ArrayList<Integer> bottomView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> queue = new LinkedList<Node>();
        root.hd = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            int hd = temp.hd;
            map.put(hd, temp.node.val);
            if(temp.left != )
        }


    }
}
*/
