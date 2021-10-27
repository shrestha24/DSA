package Stack;

import java.util.Stack;

public class LongestValidParenthesis {
    //          0    1   2
    //char = (  ||  )
    // String s =" (()"
    // String s="()"
    //o/p =2
    public static  class Node{
        char ch;
        int index;
        Node(char ch,int n){
            this.ch=ch;
            this.index=n;
        }
    }
    public int longestValidParenthesis(String s){
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='('){
                stack.push(i);
            }else {
                stack.pop();
                if (stack.isEmpty()){
                    stack.push(i);
                }else{
                    int len=i-stack.peek();
                    max=Math.max(len,max);
                }
            }
        }
        return max==Integer.MIN_VALUE?0:max;
    }

    public static void main(String[] args) {
        LongestValidParenthesis obj=new LongestValidParenthesis();
        String s=")))()()";
        //        0 123456
        System.out.println(obj.longestValidParenthesis(s));

    }
}
