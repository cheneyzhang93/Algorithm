package algorithm;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(containsDuplicate(nums));
    }

    public static int containsDuplicate(int[] nums) {

        int contain = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                contain = nums[i];
            }
        }
        return contain;
    }
}
