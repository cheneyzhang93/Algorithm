package category.array;

/**
 * 41. 缺失的第一个正数
 * <p>
 * https://leetcode-cn.com/problems/first-missing-positive/
 */
public class FirstMissingPositive_41 {

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }

    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] > 0 && nums[i] <= len && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < len; i++) {
            if (i + 1 != nums[i]) {
                return i + 1;
            }
        }
        return len + 1;
    }


}
