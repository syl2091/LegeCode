package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lege
 * @Description 用队列实现栈
 * @create 2022-06-30 13:44
 */
public class MyStack {
    //与栈元素一样的队列
    Queue<Integer> queue1;
    //辅助队列
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x);//先放在辅助队列重
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> queueTemp;
        queueTemp = queue1;
        queue1 = queue2;
        queue2 = queueTemp; // 最后交换queue1和queue2，将元素都放到queue1中
    }

    public int pop() {
        return queue1.poll();
    }



    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}
