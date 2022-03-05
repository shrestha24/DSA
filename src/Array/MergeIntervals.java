package Array;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> list = new LinkedList<>();

        for (int[] interval : intervals) {

            if (list.isEmpty() || list.getLast()[1] < interval[0])
                list.add(interval);

            else {
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] merge1(int[][] intervals) {
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.x - o2.x;
            }
        });
        List<List<Integer>> masterList = new ArrayList<>();
        for (int[] interval : intervals) {
            pq.offer(new Node(interval[0], interval[1]));
        }
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            if (masterList.size() == 0 || masterList.get(masterList.size() - 1).get(1) < node.x) {
                List<Integer> list = new ArrayList<>();
                list.add(node.x);
                list.add(node.y);
                masterList.add(list);
            } else {
                List<Integer> list = masterList.get(masterList.size() - 1);
                int y = list.get(1);
                list.remove(1);
                int max = y > node.y ? y : node.y;
                list.add(max);
            }

        }
        return masterList.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
    }
}
