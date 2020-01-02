package algorithm;

import java.util.*;

/**
 * leetcode:https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
 */
public class Intersect {

    public static void main(String[] args) {
//        int[] nums1 = new int[]{43, 85, 49, 2, 83, 2, 39, 99, 15, 70, 39, 27, 71, 3, 88, 5, 19, 5, 68, 34, 7, 41, 84, 2, 13, 85, 12, 54, 7, 9, 13, 19, 92};
//        int[] nums2 = new int[]{10, 8, 53, 63, 58, 83, 26, 10, 58, 3, 61, 56, 55, 38, 81, 29, 69, 55, 86, 23, 91, 44, 9, 98, 41, 48, 41, 16, 42, 72, 6, 4, 2, 81, 42, 84, 4, 13};
//        int[] nums1 = new int[]{21, 47, 80, 4, 3, 24, 87, 12, 22, 11, 48, 6, 89, 80, 74, 71, 74, 55, 58, 56, 4, 98, 40, 66, 49, 53, 62, 27, 3, 66, 78, 24, 48, 69, 88, 12, 80, 63, 98, 65, 46, 35, 72, 5, 64, 72, 7, 29, 37, 3, 2, 75, 44, 93, 79, 78, 13, 39, 85, 26, 15, 41, 87, 47, 29, 93, 41, 74, 6, 48, 17, 89, 27, 61, 2, 68, 99, 57, 45, 73, 25, 33, 38, 32, 58};
//        int[] nums2 = new int[]{1, 39, 6, 81, 85, 10, 38, 22, 0, 89, 57, 93, 58, 69, 65, 80, 84, 24, 27, 54, 37, 36, 26, 88, 2, 7, 24, 36, 51, 5, 74, 57, 45, 56, 55, 67, 25, 33, 78, 49, 16, 79, 74, 80, 36, 27, 89, 49, 64, 73, 96, 60, 92, 31, 98, 72, 22, 31, 0, 93, 70, 87, 80, 66, 75, 69, 81, 52, 94, 90, 51, 90, 74, 36, 58, 38, 50, 9, 64, 55, 4, 21, 49, 60, 65, 47, 67, 8, 38, 83};
        int[] nums1 = new int[]{1, 1, 1};
        int[] nums2 = new int[]{1, 1, 1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<String, String> map = new HashMap<>();
        for (int num : nums1) {
            map.put(String.valueOf(num),
                    map.containsKey(String.valueOf(num)) ?
                            map.get(String.valueOf(num)) + "a" : "a");
        }
        for (int num : nums2) {
            map.put(String.valueOf(num),
                    map.containsKey(String.valueOf(num)) ?
                            map.get(String.valueOf(num)) + "b" : "b");
        }
        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            String value = entry.getValue().toString();
            while (value.contains("a") && value.contains("b")) {
                StringBuilder temp = new StringBuilder(value);
                value = temp.deleteCharAt(temp.indexOf("a")).deleteCharAt(temp.indexOf("b")).toString();
                resultList.add(Integer.parseInt(entry.getKey().toString()));
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
