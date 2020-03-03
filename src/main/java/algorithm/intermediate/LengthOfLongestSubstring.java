package algorithm.intermediate;

import java.util.*;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/29/array-and-strings/78/
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("ab"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        List<String> res = new LinkedList<>();
        List<Integer> indexes = new LinkedList<>();
        int i = 0, j = i + 1, max = 0;
        while (i < s.length()) {
            String subStr = String.valueOf(s.charAt(i));
            int index = res.indexOf(subStr);
            if (index != -1) {
                max = Math.max(max, res.size());
                i = indexes.get(index) + 1;
                res.clear();
                indexes.clear();
            } else {
                res.add(subStr);
                indexes.add(i);
                i++;
                if (i == s.length()) max = Math.max(max, res.size());
            }
        }
        return max;
    }
}
