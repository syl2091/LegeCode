package array;

/**
 * @author lege
 * @Description 二分查找
 * @create 2022-04-13 13:35
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,7,9,10};
        int target1 = search1(nums,2);
        int target2 = search2(nums,10);
        System.out.println(target1);
        System.out.println(target2);
    }

    /**
     * 左闭右闭区间
     *
     * @return
     */
    public static int search1(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int search2(int[] nums,int target){
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return -1;

    }
}
