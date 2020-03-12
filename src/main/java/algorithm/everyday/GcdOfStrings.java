package algorithm.everyday;

/**
 * https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/
 */
public class GcdOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)) return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
