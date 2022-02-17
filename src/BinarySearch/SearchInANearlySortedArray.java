package BinarySearch;


public class SearchInANearlySortedArray {
    int search(int ar[], int target){
        int start = 0;

        int end = ar.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(ar[mid] ==  target){
                return mid;
            }
            else if(mid+1 <= ar.length -1 && ar[mid+1]>= target){
                return mid+1;
            }
            else if(mid -1 >= start && ar[mid-1] <= target){
                return mid-1;
            }
            else if (ar[mid] < target){
               end = mid -2;
            }
            else if(ar[mid] > target) {
                start = mid + 2;
            }

        }
        return -1;
    }
}
