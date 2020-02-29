package algorithm.dp;

/**
 * LeetCode：https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class NumArray {

    public static void main(String[] args) {
        /**
         * ["NumArray","sumRange","sumRange","sumRange"]
         * [[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]
         */
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }

    private int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j + 1] - sum[i];
    }
}
