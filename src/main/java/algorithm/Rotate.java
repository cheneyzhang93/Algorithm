package algorithm;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 */
public class Rotate {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1 || nums.length == k || k == 0) return;
        int len = nums.length;
        k %= nums.length;
        int[] newNums = nums.clone();
        for (int i = 0; i < len; i++) {
            nums[(i + k) % len] = newNums[i];
        }

//        System.out.println((3+3)%newNums.length);

    }

}
