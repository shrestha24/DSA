package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Krushkals_Algo {

    class Pair {
        int v;
        int weight;

        Pair(int v, int weight) {
            this.v = v;
            this.weight = weight;
        }
    }

    ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] a = points[i];
                int[] b = points[j];
                int dis = solve(a, b);
                adj.get(i).add(new Pair(j, dis));
                adj.get(j).add(new Pair(i, dis));
            }
        }

        int[] key = new int[n];
        boolean[] mst = new boolean[n];
        int[] parent = new int[n];
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mst, false);
        Arrays.fill(parent, -1);

        key[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int u = 0;
            for (int j = 0; j < n; j++) {
                if (mst[j] == false && min > key[j]) {
                    u = j;
                    min = key[j];
                }
            }

            mst[u] = true;
            for (Pair ele : adj.get(u)) {
                if (mst[ele.v] == false && ele.weight < key[ele.v]) {
                    parent[ele.v] = u;
                    key[ele.v] = ele.weight;
                }
            }
        }

        int ans = 0;
        for (int i : key)
            ans += i;
        return ans;

    }
        private int solve(int[] a,int[] b){
            int xi = a[0];
            int yi = a[1];
            int xj = b[0];
            int yj = b[1];
            int dis = Math.abs(xi - xj) + Math.abs(yi - yj);
            return dis;
        }
    }
