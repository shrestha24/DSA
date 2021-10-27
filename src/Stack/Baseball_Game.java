package Stack;

import java.util.Stack;

public class Baseball_Game {
    public int calPoints(String[] ops) {
        int n = ops.length;
        if (n == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String str = ops[i];
            if (str.equals("+")) {
                int a = stack.pop();
                int b = a + stack.peek();
                stack.push(a);
                stack.push(b);
            } else if (str.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (str.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }

            int a = 0;
            while (!stack.isEmpty()) {
                a += stack.pop();
            }
            return a;
        }

    }


