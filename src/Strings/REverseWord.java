package Strings;

public class REverseWord {
    public String reverse(String str){

        StringBuilder str1 = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            str1.append(ch);
        }

        return str1.toString();
    }
}
