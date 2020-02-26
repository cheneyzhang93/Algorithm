package algorithm;

public class IsPowerOfThree {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }

    public static boolean isPowerOfThree(int n) {
//        return n > 0 && 1162261467 % n == 0;

//        if (n < 1) return false;
//        while (n % 3 == 0) {
//            n /= 3;
//        }
//        return n == 1;

        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 3 == 0) return isPowerOfThree(n/3);
        return false;
    }
}
