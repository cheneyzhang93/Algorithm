package sort;

public class DirectInsert {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 5, 6, 8, 9, 1, 7, 4};
        DirectInsert.directInsertSort(arr);
        Common.print(arr);

    }

    public static void directInsertSort(int[] arr) {
        int i, j;
        // 外层循环从第二个元素开始
        for (i = 1; i < arr.length; i++) {
            // 存储待插入元素
            int temp = arr[i];
            // 当未达到数组的第一个元素或者待插入元素小于当前元素
            for (j = i; j > 0 && temp < arr[j - 1]; j--) {
                // 就将该元素后移
                arr[j] = arr[j - 1];
            }
            // 插入位置已经找到，立即插入
            arr[j] = temp;
        }
    }

}
