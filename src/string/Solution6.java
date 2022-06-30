package string;

/**
 * @author lege
 * @Description 实现 strStr()
 * @create 2022-06-29 15:06
 */
public class Solution6 {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        // needle为空字符串返回0
        if (m == 0) {
            return 0;
        }
        int n = haystack.length();
        if (n < m) {
            return -1;
        }

        int i = 0;
        int j = 0;
        while (i < n - m + 1) {
            //找到首字母相等
            while (i < n && haystack.charAt(i) != needle.charAt(j)) {
                i++;
            }
            //没有首字母相等
            if (i == n) {
                return -1;
            }
            i++;
            j++;
            while (i < n && j < m && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                //找到
                return i - j;
            } else {
                i -= j - 1;
                j = 0;
            }
        }
        return -1;
    }
}
