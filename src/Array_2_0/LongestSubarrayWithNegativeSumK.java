package Array_2_0;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithNegativeSumK {
    public static int getLongestSubarray(int[] arr, int k){
        int size = arr.length;

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
