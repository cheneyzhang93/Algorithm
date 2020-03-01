package algorithm.elementary;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/60/
 */
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;

        String s3 = "Fizz", s5 = "Buzz", s35 = "FizzBuzz";
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add(s35);
            } else if (i % 3 == 0) {
                res.add(s3);
            } else if (i % 5 == 0) {
                res.add(s5);
            } else {
                res.add(String.valueOf(i));
            }
        }

        return res;
    }
}
