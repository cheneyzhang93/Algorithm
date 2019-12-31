package algorithm;

import java.util.Set;
import java.util.TreeSet;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1, 2, 3, 4, 5};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new TreeSet<>();
        for (int num : nums) {
            integerSet.add(num);
        }
        return integerSet.size() != nums.length;
    }

}
