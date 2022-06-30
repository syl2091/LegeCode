package string;

/**
 * @author lege
 * @Description 翻转字符串里的单词
 * @create 2022-06-29 10:09
 */
public class Solution4 {
    // 双反转+移位，在原始数组上进行反转。空间复杂度O(1)
    public String reverseWords(String s) {
        char[] initialArr = s.toCharArray();
        reverse(initialArr, 0, s.length() - 1);
        // TODO: 2022/6/29
        return "";
    }

    private void reverse(char[] initialArr, int begin, int end) {
        while (begin<end){
            initialArr[begin]^=initialArr[end];
            initialArr[end]^=initialArr[begin];
            initialArr[begin]^=initialArr[end];
            begin++;
            end--;
        }
    }

}
