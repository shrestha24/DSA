package graph;

class FindPathExistInGraphII {
    int root[];
    int rank[];

    private int find(int x) {
        if (x == root[x])
            return x;
        return root[x] = find(root[x]);
    }

    private boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    private void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rank[rootX] > rank[rootY]) {
            root[rootY] = rootX;
        } else if (rank[rootY] > rank[rootX]) {
            root[rootX] = rootY;
        } else {
            root[rootY] = rootX;
            rank[rootX]++;
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        createDisjoinSet(n);
        for (int i = 0; i < edges.length; i++) {
            if (!isConnected(edges[i][0], edges[i][1])) {
                union(edges[i][0], edges[i][1]);
            }
        }

        return isConnected(source, destination);
    }

    private void createDisjoinSet(int n) {
        root=new int[n];
        rank=new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }
}
