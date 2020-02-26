package algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/24/design/58/
 */
public class ShuffleAnArray {

    private int[] nums;
    private int[] old;

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        ShuffleAnArray obj = new ShuffleAnArray(nums);
        int[] param_1 = obj.shuffle();
        System.out.println(Arrays.toString(param_1));
        int[] param_2 = obj.reset();
        System.out.println(Arrays.toString(param_2));
        int[] param_3 = obj.shuffle();
        System.out.println(Arrays.toString(param_3));
    }

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
        this.old = nums.clone();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return this.old;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        Random random = new Random();
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }
}
