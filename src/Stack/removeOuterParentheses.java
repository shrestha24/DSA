package Stack;

import java.util.Stack;

public class removeOuterParentheses {
    public static String removeOuterParentheses(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '('){
                stack.push(ch);
            }
            if (stack.size() > 1){
                sb.append(ch);
            }
            if (ch == ')'){
                stack.pop();
            }

        }

        return sb.toString();
     }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

}


