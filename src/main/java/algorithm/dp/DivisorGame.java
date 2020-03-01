package algorithm.dp;

/**
 * https://leetcode-cn.com/problems/divisor-game/
 */
public class DivisorGame {

    public static void main(String[] args) {
        System.out.println(divisorGame(3));
    }

    public static boolean divisorGame(int N) {
       return (N & 1) == 0;
    }

}
