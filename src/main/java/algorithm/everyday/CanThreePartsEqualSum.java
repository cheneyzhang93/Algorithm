package algorithm.everyday;

/**
 * https://leetcode-cn.com/problems/partition-array-into-three-parts-with-equal-sum/
 */
public class CanThreePartsEqualSum {

    public static void main(String[] args) {
//        int[] nums = new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
//        int[] nums = new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        int[] nums = new int[]{10, -10, 10, -10, 10, -10, 10, -10};
        System.out.println(canThreePartsEqualSum(nums));
    }

    public static boolean canThreePartsEqualSum(int[] A) {
        if (A.length == 0) return false;
        int sum = 0;
        for (int value : A) {
            sum += value;
        }
        if (sum % 3 != 0) return false;
        int time = 0, count = 0;
        sum /= 3;
        for (int value : A) {
            count += value;
            if (sum == count) {
                time++;
                count = 0;
            }
        }
        return time == 3 || (sum == 0 && time >= 3);
    }
}
