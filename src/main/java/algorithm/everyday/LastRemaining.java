package algorithm.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 */
public class LastRemaining {

    public static void main(String[] args) {
        System.out.println(lastRemaining(5, 3));
        System.out.println(lastRemaining(10, 17));
//        System.out.println(5 % 3);
    }

    public static int lastRemaining(int n, int m) {
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + m) % i;
        }
        return p;
//        List<Integer> proper = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            proper.add(i);
//        }
//        int i = 0, x = m;
//        while (proper.size() > 1) {
//            x--;
//            if (x == 0) {
//                proper.remove(i);
//                x = m;
//                i--;
//            }
//            i++;
//            if (x > 0 && i == proper.size()) {
//                i = 0;
//            }
//        }
//        return proper.get(0);

//        return 0;
    }
}
