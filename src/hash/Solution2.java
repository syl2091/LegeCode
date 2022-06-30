package hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lege
 * @Description 两个数组的交集
 * @create 2022-06-27 15:52
 */
public class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1==null||nums1.length==0||nums2==null||nums2.length==0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        //遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        int[] arr = new int[set2.size()];
        int index = 0;
        for (Integer i : set2) {
            arr[index++]=i;
        }
        return arr;
    }
}
