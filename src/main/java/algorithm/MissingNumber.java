package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/69/
 */
public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int sum2 = 0;
        boolean noZero = true;

        for (int num : nums) {
            if (num == 0) noZero = false;
            sum2 += num;
        }

        if (noZero) return 0;

        for (int i = 1; i <= len; i++) {
            sum += i;
        }

        return sum - sum2;
    }
}
