package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] digits0 = new int[]{0};
        moveZeroes(digits0);
    }

    public static void moveZeroes(int[] nums) {
        List<Integer> zeroIndex = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndex.add(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && !zeroIndex.isEmpty() && i > zeroIndex.get(0)) {
                nums[zeroIndex.get(0)] = nums[i];

                nums[i] = 0;
                zeroIndex.add(i);
                zeroIndex.remove(0);
                Collections.sort(zeroIndex);
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
