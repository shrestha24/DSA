package graph;

public class FindNumOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        DisjointSet1 obj = new DisjointSet1(n);
        for(int i = 0; i < n; i++){
            for ( int j = 0; j < n; j ++ ){
                if (isConnected[i] [j] == 1)
                {
                    obj.union(i,j);
                }
            }
        }
        return obj.findProvinces();
    }
}

//make a disjoint class
//constructor
//initialize the root and rank array
//for loop
//root = i
// rank = 1
//find
//int x
// find root of a particular node
//is connected
// int x , int y
// check if root are same
//union
//check node root is same or not
// check rank is same or not
//counter



class DisjointSet1{

    int root[];
    int rank[];


    public DisjointSet1(int size){

        root = new int[size];
        rank = new int[size];
        for(int i = 0; i < size; i++){
            root[i] = i;
            rank[i] = 1;

        }
    }

    public int find(int x){
        if(x == root[x]){
            return x;
        }

        return root[x]= find(root[x]);
    }

    public boolean isConnected(int x, int y){
        return find(x) == find(y);
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY =  find(y);

        if(rootX != rootY){
            if(rank[rootX] > rank[rootY]){
                root[rootY] = rootX;
            }

            else if(rank[rootX] < rank[rootY]){
                root[rootX] = rootY;
            }
            else {
                root[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    public int findProvinces() {
        int size = root.length;

        for(int i = 0; i < root.length; i ++){
            if (i != root[i]){
                size--;
            }
        }
        return size;
    }
}