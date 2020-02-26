package algorithm;

public class CountPrimes {

    public static void main(String[] args) {
        System.out.println(countPrimes(10000));
    }

    public static int countPrimes(int n) {
        if (n == 0 || n == 1) return 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0 && j != i) {
                    flag = false;
                    break;
                }
            }
            if (flag) count++;
        }
        return count;
    }
}
