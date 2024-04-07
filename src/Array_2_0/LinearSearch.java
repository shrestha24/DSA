package Array_2_0;

public class LinearSearch {
    public static int linearSearch(int arr[], int num){
        int sizeOfArray = arr.length;
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int num = 2;
        int ans = linearSearch(arr, num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans);
            break;
        }
    }
}
