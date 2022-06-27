package array;

/**
 * @author lege
 * @Description Solution2
 * @create 2022-06-23 13:46
 */
public class Solution3 {
    /**
     * 暴力排序
     * @param nums
     * @return
     */
    public int[] sortedSquares1(int[] nums){
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index--] = nums[left] * nums[left];
                ++left;
            } else {
                result[index--] = nums[right] * nums[right];
                --right;
            }
        }
        return result;
    }

    //双指针排序
    public  int[] sortedSquares2(int[] nums){
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[index--] = nums[right] * nums[right];
                --right;
            } else {
                result[index--] = nums[left] * nums[left];
                ++left;
            }
        }
        return result;
    }

    public  static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        Solution3 solution = new Solution3();
        int[] result = solution.sortedSquares2(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
