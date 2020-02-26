package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/25/math/63/
 */
public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = get(Character.toString(s.charAt(i)));
            if (i + 1 < s.length()) {
                int after = get(Character.toString(s.charAt(i + 1)));
                if (curr >= after) {
                    sum += curr;
                } else {
                    sum -= curr;
                }
            } else {
                sum += curr;
            }
        }
        return sum;

    }

    private static int get(String c) {
        switch (c) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }
    }

}
