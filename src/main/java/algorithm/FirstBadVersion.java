package algorithm;

/**
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/8/sorting-and-searching/53/
 */
public class FirstBadVersion {

    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {
        int l = 1, h = n;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (isBadVersion(mid)) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return h;
    }

    static boolean isBadVersion(int version) {
        return true;
    }
}
