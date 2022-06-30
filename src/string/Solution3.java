package string;

/**
 * @author lege
 * @Description 替换空格
 * @create 2022-06-29 9:50
 */
public class Solution3 {
    public String replaceSpace1(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
