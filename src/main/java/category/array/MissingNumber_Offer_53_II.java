package category.array;

/**
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * <p>
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class MissingNumber_Offer_53_II {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1, 3}));
        System.out.println(missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    }

    public static int missingNumber(int[] nums) {
        if (nums[0] != 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum += i;
        }
        for (int i = 1; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}

