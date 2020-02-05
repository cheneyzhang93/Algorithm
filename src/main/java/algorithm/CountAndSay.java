package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/39/
 */
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        if (n == 1) return "1";
        StringBuilder str = new StringBuilder("1");
        for (int m = 1; m < n; m++) {
            char[] temp = str.toString().toCharArray();
            StringBuilder str1 = new StringBuilder();
            for (int k = 0; k < temp.length; k++) {
                int i = k;
                int count = 1;
                while (i + 1 < temp.length && temp[i] == temp[i + 1]) {
                    count++;
                    i++;
                    k = i;
                }
                str1.append(count).append(temp[i]);
            }
            str = str1;
        }
        return str.toString();

    }

}
