package stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lege
 * @Description 滑动窗口的最大值
 * @create 2022-07-01 9:25
 */
public class Solution4 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==1){
            return nums;
        }

        int len = nums.length -k+1;
        //存放结果的数组
        int[] res = new int[len];
        int num = 0;
        //自定义队列
        MyQueue1 queue = new MyQueue1();
        //先将前k个元素放入队列
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }

        res[num++] = queue.peek();
        for (int i = k; i < nums.length; i++) {
            //滑动窗口移除最前面的元素，移除是判断该元素是否放入队列
            queue.poll(nums[i - k]);
            //滑动窗口加入最后面的元素
            queue.add(nums[i]);
            //记录对应的最大值
            res[num++] = queue.peek();
        }
        return res;
    }
}


class MyQueue1 {
    Deque<Integer> deque = new LinkedList<>();

    //弹出元素
    void poll(int val) {
        if (!deque.isEmpty() && val == deque.peek()) {
            deque.poll();
        }
    }
    //添加元素时，如果要添加的元素大于入口处的元素，就将入口元素弹出
    //保证队列元素单调递减
    //比如此时队列元素3,1，2将要入队，比1大，所以1弹出，此时队列：3,2
    void add(int val){
        while (!deque.isEmpty()&&val>deque.getLast()){
            deque.removeLast();
        }
        deque.add(val);
    }

    int peek(){
        return deque.peek();
    }

}
