package algorithm.everyday;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */
public class HasGroupsSizeX {

    public static void main(String[] args) {
        System.out.println(hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
        System.out.println(hasGroupsSizeX(new int[]{1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}));
        System.out.println(hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : deck) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        int gcdNum = 0;
        for (int i : map.keySet()) {
            gcdNum = gcd(gcdNum, map.get(i));
            if (gcdNum == 1) return false;
        }
        return gcdNum >= 2;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
