/*
package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Min_Stack {
        Stack<Integer> stack;
        PriorityQueue<Integer> pq;
        int min;

        public Min_Stack() {
        stack = new Stack<Integer>();
        pq = new PriorityQueue<>();
        }

        public void push(int val) {
            stack.push(val);
            pq.offer(val);

        }

        public void pop() {
        stack.pop();
        }

        public int top() {
            return stack.peek();
        }

       public int getMin() {
           pq.peek();
           pq.remove(new Integer(stack.pop()));

           }
            return ;
       }
     }
*/
