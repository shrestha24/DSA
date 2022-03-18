package Array;

public class EquivalentStrings {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();

        for(int i = 0; i < word1.length ; i++){
            str.append(word1[i]);
        }
        for(int j = 0; j < word2.length; j++){
            str1.append(word2[j]);
        }

        if(str.compareTo(str1) == 0)
            return true;

        return false;
    }
}
