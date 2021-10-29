package Stack;

import java.util.Stack;

public class Remove_Duplicate_Letters {
    public static String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++)
            lastIndex[s.charAt(i) - 'a'] = i;
            boolean[] seen = new boolean[26];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i) - 'a';
                if (seen[c]) continue;
                while (!stack.isEmpty() && stack.peek() > c && i < lastIndex[stack.peek()])
                    seen[stack.pop()] = false;
                stack.push(c);
                seen[c] = true;
            }

            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty())
                sb.append((char) (stack.pop() + 'a'));
            return sb.reverse().toString();


    }

    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
}
