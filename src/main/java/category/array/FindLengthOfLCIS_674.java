package category.array;

/**
 * 674. 最长连续递增序列
 * <p>
 * https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 */
public class FindLengthOfLCIS_674 {

    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1, 3, 5, 4, 2, 3, 4, 5}));
        System.out.println(findLengthOfLCIS(new int[]{1, 3, 5, 7}));
        System.out.println(findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        System.out.println(findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
        System.out.println(findLengthOfLCIS(new int[]{3, 3, 4, 5, 1, 2, 2, 2}));
    }

    public static int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = 1, count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] < nums[i + 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }
}
