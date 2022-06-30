package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lege
 * @Description 四数相加 II
 * @create 2022-06-28 10:34
 */
public class Solution5 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp;
        int res = 0;
        //统计两个数组中的元素之和，同时统计出现的次数，放入map  
        for (int i : nums1) {
            for (int j : nums2) {
                temp = i + j;
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }
        for (int i : nums3) {
            for (int j : nums4) {
                //统计剩余的两个元素的和，在map中找是否存在相加为0的情况，同时记录次数
                temp = i+j;
                if (map.containsKey(0-temp)){
                    res+=map.get(0-temp);
                }
            }
        }
        return res;
    }

}
