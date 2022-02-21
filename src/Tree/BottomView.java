package Tree;


import java.util.*;

public class BottomView{


    static class TreeData{
       int height;
       TreeNode node;

       public TreeData(int height, TreeNode node ){
           this.height = height;
           this.node = node;
       }
    }

    List<Integer> getBottomView(TreeNode data){
        List<Integer> list = new ArrayList();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Queue<TreeData>  queue = new LinkedList();
        queue.offer(new TreeData(0, data ));
        while(!queue.isEmpty()){
            TreeData node = queue.poll();
            int height = node.height;
            min = Math.min(min, height);
            max = Math.max(max, height);
            hm.put(height, node.node.val);

            if(node.node.left != null){
                queue.offer(new TreeData(height-1,node.node.left));
            }

            if(node.node.right != null){
                queue.offer(new TreeData(height+1, node.node.right));
            }

            for(int i = min; i <= max; i++){
                list.add(hm.get(i));
            }
        }
        return list;
    }




}
