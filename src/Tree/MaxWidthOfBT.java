/*
package Tree;

import Heap.K_Frequent_Elements;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBT {

    static class Node{
        public static int v;
        public static TreeNode node;

       public Node(int v, TreeNode node) {
            this.v = v;
            this.node = node;
        }
    }

    public static int maxWidth(TreeNode root){

        if (root == null){
            return 0;}

        int maxWIdth = -1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(1, root));
         while (!queue.isEmpty()){
             int countNodes = queue.size();
             int minValue = 0;
             int maxValue = 0;
             for (int i = 0; i < countNodes; i++) {
                 Node node = queue.poll();
                 int v = Node.v;
                 if (i == 0){
                     minValue = 0;
                 }
                 if (i ==  countNodes)

             }


         }

    }
}
*/
