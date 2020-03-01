package algorithm.dp;

/**
 * https://leetcode-cn.com/problems/three-steps-problem-lcci/
 */
public class WaysToStep {

    public static void main(String[] args) {
        System.out.println(waysToStep(61));
    }

    public static int waysToStep(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        long[] res = new long[n + 1];
        res[1] = 1;
        res[2] = 2;
        res[3] = 4;
        for (int i = 4; i <= n; i++) {
            res[i] = (res[i - 3] + res[i - 2] + res[i - 1]) % 1000000007;
        }
        return (int) res[n];
    }


}
