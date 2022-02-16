package BinarySearch;

import java.util.*;

public class BinarySearch {
    public int getBinary(int ar[], int x) {
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ar[mid] == x)
                return mid;
            else if (ar[mid] > x) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        System.out.println(low < high);// true or false   =>true

        System.out.println(low > high);// true or false   => false
        return -1;
    }



    //count of an element in an sorted array



    public static void main(String args[]) {
        int ar[] = {10, 20, 30, 40, 50, 60, 70};
        int x = 23;
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.getBinary(ar, x));
    }

}
