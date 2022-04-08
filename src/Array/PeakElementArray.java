package Array;

public class PeakElementArray {
    public int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[start] == arr[end]){
                return mid;
            }
            else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
