package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/37/
 */
public class MyAtoi {

    public static void main(String[] args) {
        String s = "   -42";
        String s1 = "4193 with words";
        String s2 = "words and 987";
        String s3 = "-91283472332";
        String s4 = "2147483648";
        String s5 = "2147483647";
        String s6 = "-2147483648";
        String s7 = "2147483646";
        String s8 = "-2147483647";
        System.out.println(myAtoi(s));
        System.out.println(myAtoi(s1));
        System.out.println(myAtoi(s2));
        System.out.println(myAtoi(s3));
        System.out.println(myAtoi(s4));
        System.out.println(myAtoi(s5));
        System.out.println(myAtoi(s6));
        System.out.println(myAtoi(s7));
        System.out.println(myAtoi(s8));
    }

    public static int myAtoi(String str) {
        char[] s = str.toCharArray();
        int i = 0;
        int flag = 1;

        for (char c : s) {
            if (c == 32) {
                i++;
                continue;
            }
            if (c == 43) {
                i++;
                break;
            }
            if (c == 45) {
                flag = -1;
                i++;
                break;
            }
            break;
        }

        int num = 0;
        for (; i < s.length; i++) {
            char c = s[i];
            if (c < 48 || c > 57) break;
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && c - 48 > 7)) {
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + c - 48;
        }

        return num * flag;
    }
}
