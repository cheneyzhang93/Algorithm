package algorithm.everyday;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world!  "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        Stack<String> stack = new Stack<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (s.charAt(i + 1) != ' ') {
                    stack.push(temp.toString());
                    temp = new StringBuilder();
                }
                continue;
            }
            temp.append(s.charAt(i));
        }
        stack.push(temp.toString());
        StringBuilder result = new StringBuilder();
        while (!stack.empty()) {
            result.append(stack.pop());
            if (!stack.empty()){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
