package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lege
 * @Description 四数相加
 * @create 2022-06-28 15:17
 */
public class Solution8 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i>0&&nums[i]==nums[i-1])
                continue;
            for (int j = i+1; j < nums.length; j++) {
                if (j>i+1&&nums[j-1]==nums[j])
                    continue;
                int left = j+1;
                int right = nums.length-1;
                while (right > left) {

                    if ((long)(nums[i]+nums[j]+nums[left]+nums[right])>target) {
                        right--;
                    }else if ((long)(nums[i]+nums[j]+nums[left]+nums[right])<target){
                        left++;
                    }else {
                        result.add(Arrays.asList( nums[i],nums[j],nums[left],nums[right]));
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;

                        left++;
                        right--;
                    }
                }
            }

        }

        return result;
    }
}
