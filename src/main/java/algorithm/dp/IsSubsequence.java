package algorithm.dp;

/**
 * LeetCode：https://leetcode-cn.com/problems/is-subsequence/
 */
public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("acb", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int lastIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            lastIndex = t.indexOf(s.charAt(i), lastIndex + 1);
            if (lastIndex == -1) return false;
        }
        return true;
    }
}
