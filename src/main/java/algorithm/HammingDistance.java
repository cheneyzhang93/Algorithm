package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/65/
 */
public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
