package Array_2_0;

public class FindTheMissingNumberInArray {
    public static int MissingNum(int arr[], int num) {
        int lengOfArr = arr.length;

        int sum = num + (num - 1) / 2;

        int sumOfNum = 0;
        for (int i = 0; i < lengOfArr; i++) {
            sumOfNum += arr[i];
        }

        int missingNum = sum - sumOfNum;
        return missingNum;
    }


    public static int missingNumXOR(int arr[], int num) {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < num - 1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ num;
        return (xor1 ^ xor2);
    }
}