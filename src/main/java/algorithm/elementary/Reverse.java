package algorithm.elementary;

/**
 * leetCode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/33/
 */
public class Reverse {

    public int reverse(int x) {
        if (x > Math.pow(2, 31) - 1 || x < Math.pow(-2, 31)) {
            return 0;
        }
        String str = String.valueOf(x).replace("-", "");
        String xstr = new StringBuffer(str).reverse().toString();
        try {
            return x < 0 ? 0 - Integer.parseInt(xstr) : Integer.parseInt(xstr);
        } catch (Exception e) {
            return 0;
        }
    }
}
