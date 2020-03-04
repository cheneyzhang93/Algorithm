package algorithm.intermediate;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/29/array-and-strings/79/
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        int l = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            int len0 = helper(s, i, i), len1 = helper(s, i, i + 1);
            int len = Math.max(len0, len1);
            if (len > r - l) {
                l = i - (len - 1) / 2;
                r = i + len / 2;
            }
        }
        return s.substring(l, r + 1);
    }

    private static int helper(String s, int l, int r) {
        int left = l, right = r;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
