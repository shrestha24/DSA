package ArrayNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {

        List<String> ans = new ArrayList<>();
        findPermutation(s.toCharArray(),0,ans);
        return ans;
    }

    private void findPermutation(char[] arr, int index, List<String> ans) {
        if(index == arr.length){
            ans.add(new String(arr));
            return;
        }

        if(Character.isDigit(arr[index])){
            findPermutation(arr, index+1,ans);
        }
        else{
            arr[index] = Character.toLowerCase(arr[index]);
            findPermutation(arr, index+1, ans);

            arr[index] = Character.toUpperCase(arr[index]);
            findPermutation(arr, index + 1, ans);
        }
    }

    public static void main(String[] args){
        String str[] =  {"a1b2"};
        System.out.println(Arrays.toString(str));

    }
}
