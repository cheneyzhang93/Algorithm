package algorithm.intermediate;

import java.util.*;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/29/array-and-strings/77/
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).toArray()));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ss = s.toCharArray();
            Arrays.sort(ss);
            String ns = String.valueOf(ss);
            List<String> value = map.get(ns);
            if (value == null || value.size() == 0) {
                List<String> valueList = new ArrayList<>();
                valueList.add(s);
                map.put(ns, valueList);
            } else {
                value.add(s);
                map.put(ns, value);
            }
        }
        return new ArrayList<>(map.values());
    }
}
