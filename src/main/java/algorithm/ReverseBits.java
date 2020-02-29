package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/66/
 */
public class ReverseBits {

    public static void main(String[] args) {
        System.out.println(reverseBits(-3));
    }

    public static int reverseBits(int n) {
        // -1073741825
//        return Integer.reverse(n);
        int num = 0;
        for (int i = 0; i < 32; i++) {
            num <<= 1;
            num |= (n & 1);
            n >>= 1;
        }

        return num;
    }

}
