package Array;

public class reverseArray {
    static void reverseArray(int arr[], int start, int end){

        int temp;

        while(start < end){

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    static void printArray(int arr[]){

        for(int i = 0; i <= arr.length; i++){
            System.out.println(arr[i] + " ");
        }
   }
}
