package graph;

public class DisjointSet {

   /* //Union
isCOnnected
    find
    constructor
    *har node ko root bana na ha aur rank ko 1 rahega
    */


    public int root[];
    public int rank[];

    public DisjointSet(int size){
        root = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int findRootOfNode(int node){
        if (node == root[node]){
            return node;
        }
        return root[node] = findRootOfNode(root[node]);
    }


    public boolean isCOnnected(int node1, int node2){
        return findRootOfNode(node1) == findRootOfNode(node2);
    }


    public void union(int node1, int node2){
        /* * find root of both nodes
         * if root!=
         * check rank
         * >rank make root to that node
         * if rank is equal
         * */


        int rootX = findRootOfNode(node1);
        int rootY = findRootOfNode(node2);
        if (rootX != rootY){
            if (rank[rootX] > rank[rootY] ){
                root[rootY] = rootX;
            }

            else if (rank[rootX] < rank[rootY]){
                root[rootX] = rootY;
            }

            else {
                root[rootY] = rootX;
                rank[rootX] ++;
            }
        }


    }
}
