package Trie;

public class LongestWordAllPrefixes {

    class Node{
        Node link[] = new Node[26];
        boolean flag = false;

        boolean containsKey(char ch){
            return (link[ch - 'a'] != null);
        }
        Node get(char ch){
            return link[ch - 'a'];
        }


    }
}
