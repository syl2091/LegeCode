package string;

/**
 * @author lege
 * @Description 反转字符串
 * @create 2022-06-28 16:36
 */
public class Solution1 {
    public  void reverseString(char[] s) {
       int l = 0;
       int r = s.length-1;
       while (l<r){
           s[l]^=s[r];
           s[r]^=s[l];
           s[l]^=s[r];
           l++;
           r--;
       }
    }
}
