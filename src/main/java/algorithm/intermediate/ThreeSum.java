package algorithm.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/29/array-and-strings/75/
 */
public class ThreeSum {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1, right = nums.length - 1, sum = 0 - nums[i];
                while (left < right) {
                    int num = nums[left] + nums[right];
                    if (num == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (num < sum) {
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        left++;
                    } else {
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
