package algorithm.elementary;

/**
 * LeetCode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/34/
 */
public class FirstUniqChar {

    public static void main(String[] args) {
        String s = "cc";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (s.indexOf(chars[i]) == i && s.lastIndexOf(chars[i]) == i) {
                return s.indexOf(chars[i]);
            }
        }
        return -1;
    }
}
