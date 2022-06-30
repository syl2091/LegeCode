package stackandqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author lege
 * @Description 有效的括号
 * @create 2022-06-30 14:56
 */
public class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> deque = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch  = s.charAt(i);
            if (ch=='('){
                deque.push(')');
            }else if (ch=='['){
                deque.push(']');
            }else if (ch=='{'){
                deque.push('}');
            }else if (deque.isEmpty()||deque.peek()!=ch){
                return false;
            }else {
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
