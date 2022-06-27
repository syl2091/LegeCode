package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lege
 * @Description 水果成篮
 * @create 2022-06-23 15:49
 */
public class Solution5 {
    //水果成篮
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        Counter counter = new Counter();
        while (right < fruits.length) {
            counter.add(fruits[right],1);
            while (counter.size() >= 3) {
                counter.add(fruits[left], -1);
                if (counter.get(fruits[left])==0)
                    counter.remove(fruits[left]);
                left++;
            }
            maxLen = Math.max(maxLen, right - left+1);
            right++;
        }
        return maxLen;
    }

    class Counter extends HashMap<Integer, Integer> {
        public int get(int k) {
            return containsKey(k) ? super.get(k) : 0;
        }

        public void add(int k, int v) {
            put(k, get(k) + v);
        }
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(solution5.totalFruit(fruits));
    }
}
