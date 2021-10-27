/*
package Stack;

import java.util.Stack;

public class BackspaceCompare{
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();



        for (int i = 0; i < s.length(); i++) {
          if(stack.size() == stack1.size() ){
              stack.push(s);
              stack1.push(t);
          }
           else if (stack.peek() == "#"){
               stack.pop();
          }

          }
        while (!stack.isEmpty()){
            if (stack.peek() != stack1.peek()){
                return false;
            }
        }

        return true;
        }


    }




*/
