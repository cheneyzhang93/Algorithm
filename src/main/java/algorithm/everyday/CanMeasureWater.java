package algorithm.everyday;

/**
 * https://leetcode-cn.com/problems/water-and-jug-problem/
 */
public class CanMeasureWater {

    public static void main(String[] args) {
        System.out.println(canMeasureWater(3, 5, 4));
        System.out.println(canMeasureWater(2, 6, 5));
    }

    public static boolean canMeasureWater(int x, int y, int z) {
        if (z == 0) return true;
        if (x + y < z) return false;
        int gcd = gcd(x, y);
        return z % gcd == 0;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
