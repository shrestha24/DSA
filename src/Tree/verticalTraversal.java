package Tree;

import java.util.*;


class VerticalOrderTraversal {
    class Tuple {
        TreeNode node;
        int hlevel;
        int vlevel;

        public Tuple(TreeNode _node, int _row, int _col) {
            this.node = _node;
            this.hlevel = hlevel;
            this.vlevel = vlevel;
        }
    }

    public List<List<Integer>> getVerticalLevelOrder(TreeNode node){
        List<List<Integer>> masterList = new ArrayList();
        Queue<Tuple> queue = new LinkedList();
        int minVerticalLevel = Integer.MAX_VALUE;
        int maxVerticalLevel = Integer.MIN_VALUE;
        queue.offer(new Tuple(node, 0, 0));
        HashMap<Integer, PriorityQueue<Tuple>> hp = new HashMap<>();
        while(!queue.isEmpty()){
            Tuple tuple = queue.poll();
            TreeNode curr= tuple.node;
            int hlevel = tuple.hlevel;
            int vlevel = tuple.vlevel;

            minVerticalLevel = Math.min(minVerticalLevel, vlevel);
            maxVerticalLevel = Math.max(maxVerticalLevel, vlevel);

            if(!hp.containsKey(vlevel))
            {
                hp.put(vlevel, new PriorityQueue<Tuple>(new Comparator<Tuple>()
                {

                    @Override
                    public int compare(Tuple o1, Tuple o2) {
                        if(o1.hlevel - o2.hlevel == 0){
                            return o1.node.val - o2.node.val;
                        }
                        else{
                            return o1.hlevel-o2.hlevel;
                        }}
                }));

            }

            hp.get(vlevel).offer(tuple);
            if(curr.left !=null){
                queue.offer(new Tuple(curr.left,hlevel+1,vlevel-1));
            }
            if(curr.right != null){
                queue.offer(new Tuple(curr.right,hlevel+1, vlevel+1));
            }
        }

        for(int i = minVerticalLevel; i <= maxVerticalLevel; i++){
            PriorityQueue<Tuple> pq = hp.get(i);
            List<Integer> list = new ArrayList<>();
            while(!pq.isEmpty()){
                list.add(pq.poll().node.val);
            }

            masterList.add(list);
        }
        return masterList;

    }


}




/*public class verticalTraversal {
    public List<List<Integer>> verticalTraversal (TreeNode root){
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<Tuple>();
        queue.offer(new Tuple(root, 0, 0));
        while (!queue.isEmpty()){
            Tuple tuple = queue.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }

            if (!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue<>());
            }

            map.get(x).get(y).offer(node.val);

            if (node.left != null) {
                queue.offer(new Tuple(node.left, x - 1, y + 1));
            }

            if (node.right != null) {
                queue.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>>  ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    System.out.println(nodes.peek());
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }
}*/
