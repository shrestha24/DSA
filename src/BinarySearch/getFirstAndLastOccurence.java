package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class getFirstAndLastOccurence {
    public List<Integer> getFirstAndLastOccurence(int ar[], int x) {
        List<Integer> list = new ArrayList<>();
        int low = 0;
        int high = ar.length - 1;
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
                list.add(left + 1);
                list.add(right - 1);
                return list;
            } else if (ar[mid] > x) {
                high = mid + 1;
            } else {
                low = mid + 1;
            }
        }
        return list;
    }
}
