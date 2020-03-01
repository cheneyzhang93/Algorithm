package algorithm.elementary;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode：https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/26/others/67/
 */
public class Generate {

    public static void main(String[] args) {

        List<List<Integer>> lists = generate(5);
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> numLists = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            generate(i, numLists);
        }
        return numLists;
    }

    /**
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     *
     * @param currRows
     * @param numLists
     * @return
     */
    public static void generate(int currRows, List<List<Integer>> numLists) {
        List<Integer> nums = new ArrayList<>();
        if (currRows == 1) {
            nums.add(1);
        } else if (currRows == 2) {
            nums.add(1);
            nums.add(1);
        } else {
            for (int i = 0; i < currRows; i++) {
                if (i == 0) {
                    nums.add(1);
                } else if (i == currRows - 1) {
                    nums.add(1);
                } else {
                    List<Integer> curr = numLists.get(currRows - 2);
                    nums.add(curr.get(i - 1) + curr.get(i));
                }
            }
        }
        numLists.add(nums);
    }
}
