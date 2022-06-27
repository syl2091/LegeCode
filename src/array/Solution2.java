package array;

/**
 * @author lege
 * @Description 移除数组元素
 * @create 2022-06-23 13:37
 */
public class Solution2 {
    public  static int removeElement(int[] nums, int val) {
        //快慢指针
        int fastIndex = 0;
        int slowIndex;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
                if (nums[fastIndex]!=val){
                    nums[slowIndex] = nums[fastIndex];
                    slowIndex++;
                }
        }
        return slowIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}
