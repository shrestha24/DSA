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
    public int countOfAnElementInSortedArray(int ar[], int x) {
        List<Integer> list = new ArrayList<>();
        int low = 0;
        int high = ar.length - 1;
        int count = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ar[mid] == x) {
                int left = mid;
                int right = mid;
                while (left >= 0 && ar[left] == x) {
                    left--;
                }
                while (right < ar.length && ar[right] == x) {
                    right++;
                }
                count = right - left - 1;
                return count;

            } else if (ar[mid] > x) {
                high = mid + 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }


    public static void main(String args[]) {
        int ar[] = {10, 20, 30, 40, 50, 60, 70};
        int x = 23;
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.getBinary(ar, x));
    }

}
