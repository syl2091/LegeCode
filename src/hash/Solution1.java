package hash;

/**
 * @author lege
 * @Description 有效的字母异位词
 * @create 2022-06-27 14:41
 */
public class Solution1 {
    public boolean isAnagram(String s, String t) {
        int[] recode = new int[26];
        for (char c : s.toCharArray()) {
            recode[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            recode[c - 'a'] -= 1;
        }

        for (int i : recode) {
            if (i != 0)
                return false;
        }

        return true;
    }
}
