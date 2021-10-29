package Stack;

import java.util.Stack;

public class validate_Stack_Sequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int poppedIndex = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[poppedIndex]) {
                stack.pop();
                poppedIndex++;
            }

        }
        return poppedIndex == popped.length;
    }

    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4 ,5};
        int ar1[] = {4, 5, 3, 2, 1};
        System.out.println();
    }
}
