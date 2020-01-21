package algorithm;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/36/
 */
public class IsPalindrome {

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        char[] s1 = s.toLowerCase().toCharArray();
        for (int i = 0; i < s1.length; i++) {
            if (!(s1[i] >= 97 && s1[i] <= 122) && !(s1[i] >= 48 && s1[i] <= 57)) {
                s1[i] = '*';
            }
        }
        s1 = String.valueOf(s1).replace("*", "").toCharArray();
        for (int i = 0; i < s1.length / 2; i++) {
            if (s1[i] != s1[s1.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
