package hash;

/**
 * @author lege
 * @Description 赎金信
 * @create 2022-06-28 13:37
 */
public class Solution6 {
    public  boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[26];
        for (char c : magazine.toCharArray()) {
            res[c-'a']+=1;
        }
        for (char c : ransomNote.toCharArray()) {
            res[c-'a']-=1;
        }
        for (int i : res) {
            if (i<0){
                return false;
            }
        }
        return true;
    }
}
