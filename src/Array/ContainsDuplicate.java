package Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {

            if (entry.getValue() >= 2) {
                return true;
            }
        }
        return false;
    }
}
