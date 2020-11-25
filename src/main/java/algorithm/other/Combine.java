package algorithm.other;

import java.util.LinkedList;
import java.util.List;

public class Combine {

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    static List<List<Integer>> res = new LinkedList<>();

    public static List<List<Integer>> combine(int n, int k) {
        backtrack(n, k, 1, new LinkedList<>());
        return res;
    }

    public static void backtrack(int n, int k, int start, LinkedList<Integer> track) {
        if (track.size() == k) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = start; i <= n; i++) {
            if (track.contains(i)) {
                continue;
            }
            track.add(i);
            backtrack(n, k, i + 1, track);
            track.removeLast();
        }
    }
}
