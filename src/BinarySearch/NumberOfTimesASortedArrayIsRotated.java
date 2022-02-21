package BinarySearch;

public class  NumberOfTimesASortedArrayIsRotated{
    int numberofTimesArrayRotated(int ar[], int target){
        int start = 0;
        int end = ar.length-1;
        int mid;

        int n = ar.length;

        while(start <= end){
            mid =start+(end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid+n-1)%n;
            if(ar[mid] <= ar[next] && ar[mid]<= ar[prev]){
                return ar[mid];
            }else if(ar[mid] >= ar[start] && ar[mid] <= ar[end]){
                return ar[start];
            }
            else if(ar[start] <= ar[mid]){
                start = mid+1;
            }
            else if(ar[mid] <= ar[end]){
                end=mid+1;
            }
        }
        return -1;
    }
}
