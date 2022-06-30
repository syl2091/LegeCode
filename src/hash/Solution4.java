package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lege
 * @Description 两数之和
 * @create 2022-06-28 9:36
 */
public class Solution4 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }

        return res;
    }
}
