package category;

/**
 * 1343. 大小为 K 且平均值大于等于阈值的子数组数目
 * <p>
 * https://leetcode-cn.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
 */
public class NumOfSubarrays_1343 {

    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
        System.out.println(numOfSubarrays(new int[]{1, 1, 1, 1, 1}, 1, 0));
        System.out.println(numOfSubarrays(new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3}, 3, 5));
        System.out.println(numOfSubarrays(new int[]{7, 7, 7, 7, 7, 7, 7}, 7, 7));
        System.out.println(numOfSubarrays(new int[]{4, 4, 4, 4}, 4, 1));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        if (k > arr.length) {
            return 0;
        }

        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= threshold) {
            count++;
        }
        sum -= arr[0];
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            if (sum / k >= threshold) {
                count++;
            }
            sum -= arr[i - k + 1];
        }
        return count;
    }

}
