package Array;

//Find Smallest Letter Greater Than Target

/*Input: letters = ["c","f","j"], target = "a"
  Output: "c"
*/
public class FindSmallestLetter {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start);

             if (letters[mid] > target)
                  end = mid -1;

            else start = mid + 1;
        }
        return letters[start % letters.length];
    }
}
