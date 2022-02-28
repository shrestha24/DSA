package Strings;

import java.util.HashMap;
import java.util.*;

public class CountConsistentString {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < allowed.length(); i++){
            char ch = allowed.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int count = 0;
        for(int i = 0; i < words.length; i++){
            boolean check = true;
            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);

                if(!hm.containsKey(ch)){
                    check = false;
                    break;
                }

            }
            if(check)
                count ++;
        }
        return count;
    }





    public int countString(String allowed,String []words){
        HashMap<Character,Integer> hm=new HashMap<>();
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0;i<allowed.length();i++){
            char ch=allowed.charAt(i);

            hs.add(ch);

            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(int i=0;i<words.length;i++){
           boolean check=true;
            for(int j=0;j<words[i].length();j++){
               char ch=words[i].charAt(j);
               if(!hs.contains(ch)){
                   check=false;
                   break;
               }
               if(!hm.containsKey(ch)){
                   check=false;
                   break;
               }
           }
            if(check)
                count++;
        }
        return count;
    }


}
