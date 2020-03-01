package algorithm.elementary;

/**
 * LeetCode：https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/68/
 */
public class IsValid {

    public static void main(String[] args) {
//        System.out.println(isValid("()"));
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("(]"));
//        System.out.println(isValid("([)]"));
//        System.out.println(isValid("{[]}"));
        System.out.println(isValid("(([]){})"));
    }

    public static boolean isValid(String s) {
        s = s.replace(" ", "");
        int i = 0;
        int len = s.length();
        while (i < len) {
            s = s.replace("()", "")
                    .replace("{}", "")
                    .replace("[]", "");
            i+=2;
        }
        return s.length() == 0;
    }
}
