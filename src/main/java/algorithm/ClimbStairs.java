package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/23/dynamic-programming/54/
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] res = new int[n + 1];
        res[1] = 1;
        res[2] = 2;
        for (int i = 3; i <= n; i++) {
            res[i] = res[i - 2] + res[i - 1];
        }

        return res[n];
    }

}
