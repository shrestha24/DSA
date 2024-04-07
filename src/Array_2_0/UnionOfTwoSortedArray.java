package Array_2_0;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {
    public static ArrayList<Integer> UnionOfArrays(int arrA[], int arrB[]){
        int arrAlength = arrA.length;
        int arrBlength = arrB.length;
        int i = 0; int j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < arrAlength && j < arrBlength){
            if (arrA[i] <= arrB[j]){

                if (Union.size() == 0 || Union.get(Union.size()-1) != arrA[i])
                    Union.add(arrA[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arrA[i])
                    Union.add(arrB[i]);
                j++;
            }
        }
        while (i < arrAlength){
            if (Union.get(Union.size()-1) != arrA[i])
                Union.add(arrA[j]);
            i++;
        }
        while (j < arrBlength){
            if (Union.get(Union.size()-1) != arrB[j])
                Union.add(arrB[j]);
                j++;
        }
        return Union;
    }
}
