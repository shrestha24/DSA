package Array_2_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static String twoSum(int arr[], int target){
        int size = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int num = arr[i];
            int balance = target - num;
            if (map.containsKey(balance)) {
                return "yes";
            }
            map.put(arr[i], i);
        }
        return "no";
    }

    public static String twoSumOptimize(int arr[], int target) {
        Arrays.sort(arr);
        int size = arr.length;
        int left = 0, right = size - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "yes";
            } else if (sum < target) left++;
            else right--;

        }
        return "no";
    }

    public static void sortArray(ArrayList<Integer> arr, int n) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) cnt0++;
            else if (arr.get(i) == 1) cnt1++;
            else cnt2++;
        }

        for (int i = 0; i < cnt0; i++)
            arr.set(i, 0);
            for (int i = cnt0; i < cnt0 + cnt1; i++)
            arr.set(i, 1);
        for (int i = cnt0 + cnt1; i < n; i++) {
            arr.set(i, 2);
        }
    }

}
