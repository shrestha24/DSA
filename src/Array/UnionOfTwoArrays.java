package Array;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public int union(int ar[], int ar2[]){
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < ar.length; i++) {
            hs.add(ar[i]);
        }
        for (int i = 0; i < ar2.length; i++) {
            hs.add(ar2[i]);
        }

        return hs.size();

    }

}
