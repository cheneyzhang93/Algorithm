package algorithm.elementary;

import java.util.*;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits0 = new int[]{8};
        int[] digits1 = new int[]{9};
        int[] digits2 = new int[]{8, 8};
        int[] digits3 = new int[]{8, 9};
        int[] digits4 = new int[]{9, 9};
        int[] digits5 = new int[]{2, 4, 9, 3, 9};
        int[] digits6 = new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        System.out.println(Arrays.toString(plusOne(digits0)));
        System.out.println(Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits3)));
        System.out.println(Arrays.toString(plusOne(digits4)));
        System.out.println(Arrays.toString(plusOne(digits5)));
        System.out.println(Arrays.toString(plusOne(digits6)));
    }

    public static int[] plusOne(int[] digits) {
        // 个位数+1
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] > 9) {
                if (i - 1 >= 0) {
                    digits[i - 1] += 1;
                    digits[i] %= 10;
                } else {
                    int[] expend = new int[digits.length + 1];
                    System.arraycopy(digits, 0, expend, 0, expend.length-1);
                    expend[0] = 1;
                    return expend;
                }
            }
        }
        return digits;
    }

}
