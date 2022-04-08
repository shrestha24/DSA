package ArrayNew;

import java.util.HashSet;

class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums){

        HashSet<Integer> set = new HashSet<>();
        for(int element : nums){
            set.add(element);
        }
        int length = 0;
        int seq = 0;

        for(int element : set){
            if(!set.contains(element - 1)){
                length = 0;

                while(set.contains(element + length)){
                    length++;
                }
                seq = Math.max(length, seq);
            }
        }
        return seq;
    }
}
