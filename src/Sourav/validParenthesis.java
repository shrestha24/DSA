package Sourav;

public class validParenthesis {
    /*   //  () => True
    // {) => false
    // { => false
    //} => false
    // {(]) => false
    static boolean validParenthesis(String s){
        Stack<Character> stack=new Stack<>();
        if (s.length()==0){
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
            switch (ch){
                case '(':
                case '{':
                case '[':stack.push(ch);break;
                case ')': if (stack.isEmpty()){
                        return  false; }
                        if (stack.peek()=='('){
                            stack.pop();
                        }else {
                            return false;
                        }break;
                case ']': if (stack.isEmpty()){
                    return  false; }
                    if (stack.peek()=='['){
                        stack.pop();
                    }else {
                        return false;
                    }break;
                case '}': if (stack.isEmpty()){
                    return  false; }
                    if (stack.peek()=='{'){
                        stack.pop();
                    }else {
                        return false;
                    }break;
                default:
            }
        }
        return stack.isEmpty();
*/
}
