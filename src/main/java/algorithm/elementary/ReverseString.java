package algorithm.elementary;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/32/
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}
