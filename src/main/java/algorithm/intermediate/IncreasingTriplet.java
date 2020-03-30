package algorithm.intermediate;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/29/array-and-strings/80/
 */
public class IncreasingTriplet {

    public static void main(String[] args) {
//        System.out.println(increasingTriplet(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(increasingTriplet(new int[]{5, 4, 3, 2, 1}));

        System.out.println(increasingTriplet(new int[]{5, 1, 5, 5, 2, 5, 4}));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= max) {
                max = num;
            } else {
                return true;
            }
        }
        return false;
    }

}
