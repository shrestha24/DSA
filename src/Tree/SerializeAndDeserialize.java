package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserialize {
    public String serialize(TreeNode root){

        if (root == null)
            return "";
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder str = new StringBuilder();

        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();

            if (root == null){
                str.append("null");
                continue;
            }

            str.append(str + " ");
            queue.add(root.left);
            queue.add(root.right);
        }
        return str.toString();
    }

    public TreeNode deserialize(String data){

        if (data == null)
           return null;

        Queue<TreeNode> queue = new LinkedList<>();
        String[] values = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);

        for (int i = 0; i < values.length; i++) {
            TreeNode parent = queue.poll();

            if (!values[i].equals("null")){
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                queue.add(left);
            }

            if (!values[i].equals("null")){
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right =right;
                queue.add(right);
            }
        }
        return root;
    }










}
