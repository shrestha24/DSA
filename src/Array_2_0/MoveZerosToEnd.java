package Array_2_0;

public class MoveZerosToEnd {
    public static int[] moveZeros(int sizeOfArray, int arr[]){
        sizeOfArray = arr.length;
        int j = -1;
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] == 0){
                j = i;
                break;
            }
        }

        if (j == -1)
            return arr;

        for (int i = j+1; i < sizeOfArray; i++) {
            if (arr[i] != 0){
               int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int size = arr.length;
        int ans[] = moveZeros(size, arr);
        for (int i = 0; i < size; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

}
