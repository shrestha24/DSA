package Sourav;

import java.util.Stack;

public class BakSpaceCompare {
    public boolean backSpace(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        compute(stackS, s);
        compute(stackT, t);
        if (stackS.size() == stackT.size()) {
            while (!stackS.isEmpty()) {
                if (stackS.pop() != stackT.pop()) {
                    return false;
                }

            }
            return true;
        } else {
            return false;
        }


    }

    private void compute(Stack<Character> stack, String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
    }
}
