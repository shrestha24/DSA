package Stack;

import java.util.Arrays;

public class RainWaterTapping {
    static int RainWater (int ar[]){
        int greaterLeft[] = new int[ar.length];
        int greatestRight[] = new int[ar.length];
        int maxR = Integer.MIN_VALUE;
        int maxL = Integer.MIN_VALUE;
        System.out.println("Hello");
        //find max from left
        for (int i = 0; i < ar.length; i++) {
            maxL = Math.max(maxL, ar[i]);
            greaterLeft[i] =maxL;
        }

        //find max from right
        for (int i = ar.length-1; i >=0 ; i--) {
            maxR = Math.max(maxR, ar[i]);
            greatestRight[i] = maxR;
        }
        System.out.println(Arrays.toString(greaterLeft));
        System.out.println(Arrays.toString(greatestRight));

        //find min from maxL[i] and maxR[i]
        //mark the difference betn left n right max
        //sum += min-ar[i]
        int area=0;
        for (int i = 0; i < ar.length; i++) {
            int min=Math.min(greaterLeft[i],greatestRight[i]);//min
            System.out.println(min);
            area += ( min-ar[i])>0?(min-ar[i]):0;

        }
        return area;


    }

    public static void main(String[] args) {
        int ar[] = {3, 0, 0, 1, 0, 4 };
        System.out.println(RainWater(ar));

    }
}
