package algorithm.everyday;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/sorted-merge-lcci/
 */
public class Merge {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] >= B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }

        }
        while (j >= 0) A[k--] = B[j--];

//        for (int num : A) {
//            System.out.print(num + " ");
//        }
//        System.out.println();

//        for (int i = m, j = 0; i < A.length && j < n; i++, j++) {
//            A[i] = B[j];
//        }
//        Arrays.sort(A);
    }
}
