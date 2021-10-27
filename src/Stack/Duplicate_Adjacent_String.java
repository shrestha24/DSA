package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Duplicate_Adjacent_String {
    public String removeDuplicates(String s) {
         Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (stack.size() == 0){
                stack.push(s.charAt(i));
            }
            else if (stack.peek()==s.charAt(i)){
                stack.pop();
            }
            else stack.push(s.charAt(i));

        }
         StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();






    }

}
