package Tree;


import java.util.*;

public class TopViewTraversal {
    public class TreeData{
        int height;
        TreeNode node;

        public TreeData(int height, TreeNode node){
            this.height = height;
            this.node = node;
        }
    }

    List<Integer> getBottomView(TreeNode node){
        List<Integer> masterList = new ArrayList();
        HashMap<Integer, Integer> hp = new HashMap();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Queue<TreeData> queue = new LinkedList();
        queue.offer(new TreeData(0, node));

        while(!queue.isEmpty()){
            TreeData curr = queue.poll();
            int height = curr.height;
            min = Math.min(min, height);
            max = Math.max(max, height);
            hp.put(height, curr.node.val);

            if(curr.node.left != null){
                queue.offer(new TreeData(height-1, curr.node.left));
            }

            if(curr.node.right != null){
                queue.offer(new TreeData(height+1, curr.node.right));
            }
        }
        for(int i = min; i <= max; i++){
            masterList.add(hp.get(i));
        }
        return masterList;
    }
}