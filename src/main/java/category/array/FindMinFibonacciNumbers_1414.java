package category.array;

/**
 * 1414. 和为 K 的最少斐波那契数字数目
 * <p>
 * https://leetcode-cn.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
 */
public class FindMinFibonacciNumbers_1414 {

    public static void main(String[] args) {
        System.out.println(findMinFibonacciNumbers(7));
        System.out.println(findMinFibonacciNumbers(10));
        System.out.println(findMinFibonacciNumbers(19));
    }

    public static int findMinFibonacciNumbers(int k) {
        return fibonacci(k, 0);
    }

    public static int fibonacci(int k, int count) {
        if (k == 0) {
            return count;
        }
        int a = 1, b = 1, c;
        while (true) {
            c = a + b;
            if (c > k) {
                break;
            }
            a = b;
            b = c;;
        }
        return fibonacci(k - b, ++count);
    }

}
