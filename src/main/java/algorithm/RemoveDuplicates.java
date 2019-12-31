package algorithm;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Iterator<Integer> integers = set.iterator();
        int i = 0;
        while (i < set.size() && integers.hasNext()) {
            nums[i] = integers.next();
            i++;
        }
        return set.size();
    }

}
