package Array_2_0;

import java.util.HashMap;
import java.util.Map;

public class FindNumberAppearsOne {
    public static int getSingleElement(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cont = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cont++;
            }
            if (cont == 1) return num;
        }
        return -1;
    }


    public static int getSingleElementHashmap(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }

    public static int getSingleElementXOR(int arr[]) {
        int size = arr.length;

        int xorr = 0;
        for (int i = 0; i < size; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
}