package Array_2_0;

public class LongestSubarrayWithKSum {
    public static int getLongestSubarray(int arr[], long k) {
        int lengthOfArray = arr.length;

        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while (right < lengthOfArray) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < lengthOfArray)
                sum += arr[right];
        }
        return maxLen;
    }
}
