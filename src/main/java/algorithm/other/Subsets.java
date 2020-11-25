package algorithm.other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, new LinkedList<>(), 0);
        return res;
    }

    static List<List<Integer>> res = new ArrayList<>();

    public static void backtrack(int[] nums, LinkedList<Integer> track, int start) {
        if (track.size() != 0) {
            res.add(new LinkedList<>(track));
        }
        for (int i = start; i < nums.length; i++) {
            track.add(nums[i]);
            backtrack(nums, track, i + 1);
            track.removeLast();
        }
    }
}
