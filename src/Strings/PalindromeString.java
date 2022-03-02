package Strings;

public class PalindromeString {

    public boolean ispalindrome(String str){

        int j = str.length()-1;

        for(int i = 0 ; i < str.length()/2; i++){
            char ch = str.charAt(i);
            char ch1 = str.charAt(j);

            if(ch != ch1){
                return false;
            }

            j--;
        }
        return true;
    }
}
