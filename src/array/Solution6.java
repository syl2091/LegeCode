package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author lege
 * @Description 螺旋矩阵II
 * @create 2022-06-24 14:04
 */
public  class Solution6 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        //左边界
        int left = 0;
        //右边界
        int right = n - 1;
        //上边界
        int top = 0;
        //下边界
        int bottom = n - 1;
        //计数器
        int num = 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            for (int i = right - 1; i >= left; i--) {
                if (top == bottom)
                    break;
                matrix[bottom][i] = num++;
            }
            for (int i = bottom - 1; i > top; i--) {
                if (left == right)
                    break;
                matrix[i][left] = num++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        int[][] matrix = solution.generateMatrix(4);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}