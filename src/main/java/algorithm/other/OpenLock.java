package algorithm.other;

import java.util.*;

public class OpenLock {

    public static void main(String[] args) {
        System.out.println(openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
    }

    public static String plusOne(String s, int j) {
        char[] a = s.toCharArray();
        if (a[j] == '9') {
            a[j] = '0';
        } else {
            a[j] += 1;
        }
        return new String(a);
    }

    public static String minusOne(String s, int j) {
        char[] a = s.toCharArray();
        if (a[j] == '0') {
            a[j] = '9';
        } else {
            a[j] -= 1;
        }
        return new String(a);
    }

    public static int openLock(String[] deadends, String target) {
        List<String> deadendss = Arrays.asList(deadends);
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        Set<String> visited = new HashSet<>();
        visited.add("0000");
        int step = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                if (curr != null) {
                    if (deadendss.contains(curr)) {
                        continue;
                    }
                    if (curr.equals(target)) {
                        return step;
                    }
                    for (int j = 0; j < 4; j++) {
                        String up = plusOne(curr, j);
                        if (!visited.contains(up)) {
                            queue.add(up);
                            visited.add(up);
                        }
                        String down = minusOne(curr, j);
                        if (!visited.contains(down)) {
                            queue.add(down);
                            visited.add(down);
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
