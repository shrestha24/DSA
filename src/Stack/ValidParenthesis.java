package Stack;

import java.util.Stack;

public class ValidParenthesis {
    static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x =='(' || x == '{' || x == '[' ){
                stack.push(x);
            }

            if (stack.isEmpty())
               return false;


            switch (x){
                case ')': if (stack.isEmpty()){
                    return false;}
                    if (stack.peek() == '('){
                        stack.pop();}
                    else {return false;} break;

                case '}':if (stack.isEmpty()){
                    return false;}
                    if (stack.peek() == '{'){
                        stack.pop();}
                    else {return false;} break;

                case ']':if (stack.isEmpty()){
                    return false;}
                    if (stack.peek() == '['){
                        stack.pop();}
                    else {return false;} break;

                    default:
            }
        }

             return stack.isEmpty();

    }



    public static void main(String[] args) {

        String s =  "([})";
        System.out.println(isValid(s));
        System.out.println("() =>" +isValid("()") );
        System.out.println("([]) =>" +isValid("([])"));


    }
}

