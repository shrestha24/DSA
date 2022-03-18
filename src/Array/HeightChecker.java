package Array;
/*
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]*/

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {

      int ar[] = new int[heights.length];

              for(int i = 0; i < heights.length; i++){
                  ar[i] = heights[i];

              }
              Arrays.sort(ar);
              int count = 0;
              for(int j = 0; j < ar.length; j++){
                  if(ar[j] != heights[j])
                      count ++;
              }
              return count;
        }
    }

