package stackandqueue;

import java.util.Stack;

/**
 * @author lege
 * @Description 用栈实现队列
 * @create 2022-06-30 10:52
 */
public class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    public MyQueue(){
        //负责进栈
        stackIn = new Stack<>();
        //负责出栈
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        dumpstackIn();
        return stackOut.pop();
    }

    // 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
    private void dumpstackIn() {
        if (!stackOut.isEmpty())return;
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }

    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }

    public boolean empty() {
        if (stackIn.isEmpty()&&stackOut.isEmpty()){
            return true;
        }
        return false;
    }





}
