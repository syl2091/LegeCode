package stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lege
 * @Description 逆波兰表达式求值
 * @create 2022-06-30 16:51
 */
public class Solution3 {
    public static int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for (String s : tokens) {
            if ("+".equals(s)) {
                deque.push(deque.pop() + deque.pop());
            } else if ("-".equals(s)) {
                deque.push(-deque.pop() + deque.pop());
            } else if ("*".equals(s)) {
                deque.push(deque.pop() * deque.pop());
            } else if ("/".equals(s)) {
                int temp1 = deque.pop();
                int temp2 = deque.pop();
                deque.push(temp2 / temp1);
            } else {
                deque.push(Integer.valueOf(s));
            }
        }

        return deque.pop();
    }
}
