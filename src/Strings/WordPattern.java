package Strings;

import java.util.*;

public class WordPattern {
    /*public boolean wordPattern(String pattern, String s) {
        return false;
    }

        private String getPatternSentence1(String str1) {
            HashMap<String, Integer> hm = new HashMap<>();
            String ar[] = str1.split(" ");
            int sNo = 1;

        }*/


    public boolean wordPattern12(String pattern, String s) {
        String pat1=getPattern(pattern);
        String pat2=getPatternSentence(s);
        if(pat1.equals(pat2))
            return true;
        return false;
    }

    //"dog cat cat dog"
    private String getPatternSentence(String str) {
        HashMap<String, Integer> hm = new HashMap<>();
        String ar[] = str.split(" ");
        int sNo = 1;
        for (int i = 0; i <= ar.length; i++) {
            if (!hm.containsKey(ar[i])) {
                hm.put(ar[i], sNo);
                sNo++;
            }
            //
        }
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i <= ar.length; i++) {
            int value = hm.get(ar[i]);
            str1.append(value);
        }
        return str1.toString();
    }

    // "abba"
    private String getPattern(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int counter=1;
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,counter);
                counter++;
            }
            str1.append(hm.get(ch));
        }
        return str1.toString();
    }
}
