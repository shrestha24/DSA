package Array;

import java.util.HashMap;
import java.util.Map;

//nums = [1,2,3,3]
   //      Output: 3
public class NRepeatedArray {
    public int repeatedNTimes(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        Integer max = -1;
        int ele = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){

            if(entry.getValue() == nums.length/2){
                return entry.getKey();
            }

            if(max < entry.getValue()){
             max =entry. getValue();
             ele = entry.getKey();
            }

        }
        return ele;
    }
}
