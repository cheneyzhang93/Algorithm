package algorithm.elementary;

import java.util.Arrays;
import java.util.Comparator;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/40/
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"dog", "racecar", "car"};
        String[] strs2 = {"cc", "c"};
        String[] strs3 = {"a"};
        String[] strs4 = {""};
        String[] strs5 = {};
        String[] strs6 = {"aca", "cba"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs4));
        System.out.println(longestCommonPrefix(strs5));
        System.out.println(longestCommonPrefix(strs6));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        char[] minStrChars = strs[0].toCharArray();
        for (int i = 0; i < minStrChars.length; i++) {
            boolean flag = true;
            char prefixChar = minStrChars[i];
            for (String str : strs) {
                char currChar = str.charAt(i);
                if (prefixChar != currChar) {
                    flag = false;
                    break;
                }
            }
            if (i != 0 && prefix.length() > 0 && flag) {
                prefix.append(prefixChar);
            } else if (i == 0 && prefix.length() == 0 && flag) {
                prefix.append(prefixChar);
            }
        }
        return prefix.toString();
    }

}
