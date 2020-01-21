package algorithm;

import java.util.Arrays;

/**
 * LeetCode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/35/
 */
public class IsAnagram {

    public static void main(String[] args) {
        String s = "baccc", t = "cbcac";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] s1 = s.toLowerCase().toCharArray();
        char[] t1 = t.toLowerCase().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }

}
