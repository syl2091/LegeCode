package array;

/**
 * @author lege
 * @Description 长度最小的子数组
 * @create 2022-06-23 15:31
 */
public class Solution4 {
    // 滑动窗口
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = nums.length + 1;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= s) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return minLen == nums.length + 1 ? 0 : minLen;
    }

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution.minSubArrayLen(16, nums));
    }

}
