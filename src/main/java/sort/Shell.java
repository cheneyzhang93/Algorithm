package sort;

public class Shell {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 6, 8, 9, 1, 7, 4};
        shellSort(arr);
        Common.print(arr);
    }

    public static void shellSort(int[] arr) {
        int len = arr.length;
        int f = 2;
        for (int gap = len / f; gap > 0; gap /= 2) {
            // 直接插入排序
            int i, j;
            // 外层循环从第二个元素开始
            for (i = gap; i < len; i++) {
                // 存储待插入元素
                int temp = arr[i];
                // 当未达到数组的第一个元素或者待插入元素小于当前元素
                for (j = i; j >= gap && temp < arr[j - gap]; j -= gap) {
                    // 就将该元素后移
                    arr[j] = arr[j - gap];
                }
                // 插入位置已经找到，立即插入
                arr[j] = temp;
            }
        }
    }
}
