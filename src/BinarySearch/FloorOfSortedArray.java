package BinarySearch;

public class FloorOfSortedArray {
   static int findfloor(int ar[], int n, int key){
        int start, end, mid;
        start = 0;
        end = n - 1;
        while (start <= end){
            mid = start+(end-start)/2;
            if (ar[mid] == key){
                return mid;}
           else if (ar[mid] < key){
               start = mid+1;
            }
           else end = mid-1;
        }
        return start-1!=-1?start:start;
    }

    public static void main(String[] args) {
        int ar[] = {11, 12, 15, 18, 2, 5, 6, 8};
        System.out.println(findfloor(ar, 7, 13));
    }
}
