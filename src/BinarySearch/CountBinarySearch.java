package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class CountBinarySearch {
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
}
