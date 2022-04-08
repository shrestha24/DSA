package Strings;

import java.util.Stack;

public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        compute(stack1, s);
        compute(stack2, t);
        if(stack1.size() == stack2.size()){
            while(!stack1.isEmpty()){
                if(stack1.pop() != stack2.pop())
                    return false;
            }
            return true;
        }
        else
            return false;
        
    }

    private void compute(Stack<Character> stack, String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                stack.push(ch);
            }
        }

    }
}

