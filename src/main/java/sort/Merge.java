package sort;

public class Merge {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 6, 8, 9, 1, 7, 4};
        int[] temp = new int[arr.length];
        Merge.mergeSort(arr, 0, arr.length - 1, temp);
        Common.print(arr);

    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        // left 为左侧下标,初始化为0, right为右侧下标，初始化为数组length-1
        // 分而治之，每次递归都将arr拆分为以/2的形式拆分为跟小的逻辑数组
        // left<right证明逻辑数组中还存在1个以上的元素
        // left=right的时候,证明逻辑数组中只存在一个元素,这个元素必定是有序的
        // 一个元素的时候，则不治而治
        if (left < right) {
            // 分
            int mid = (left + right) / 2;
            // 治->left
            mergeSort(arr, left, mid, temp);
            // 治->right
            mergeSort(arr, mid + 1, right, temp);
            // 合
            merge(arr, left, mid, right, temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        // 代理变量，不影响下面if判断
        int i = left, j = mid + 1;
        // k为逻辑上合并数组temp的下标
        for (int k = left; k <= right; k++) {
            // 1. left 数组 下标从 left->mid,如果 i > mid 则认为left数组已经排序完成，只需要排序 right数组，所以取arr[j],并j++
            // 2. right 数组 下标从 mid+1->right,如果 j > right,则认为right数组已经排序完成，只需要排序 left数组，所以取arr[i],并i++
            // 3. 如果left数组下标的元素小于right数组的下标值，则取出left数组中arr[i],并i++,否则取出arr[j],并j++
            if (i > mid) {
                temp[k] = arr[j++];
            } else if (j > right) {
                temp[k] = arr[i++];
            } else if (arr[i] <= arr[j]) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
            }
        }
        // copy temp->arr
        if (right + 1 - left >= 0) System.arraycopy(temp, left, arr, left, right + 1 - left);
    }
}
