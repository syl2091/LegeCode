package string;

/**
 * @author lege
 * @Description 左旋转字符串
 * @create 2022-06-29 13:56
 */
public class Solution5 {
    public String reverseLeftWords(String s, int n) {
        //全部反转
        char[] ch = s.toCharArray();
        reverse(ch,0,s.length()-1);
        //反转前半部分
        reverse(ch,0,s.length()-n);
        //反转后半部分
        reverse(ch,s.length()-n,s.length()-1);

        return new String(ch);


    }

    private void reverse(char[] s, int start, int end) {
        while (start<end){
            s[start]^=s[end];
            s[end]^=s[start];
            s[start]^=s[end];
            start++;
            end--;
        }
    }
}