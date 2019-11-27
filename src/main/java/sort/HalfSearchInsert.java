package sort;

public class HalfSearchInsert {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 5, 6, 8, 9, 1, 7, 4};
        halfSearchInsertSort(arr);
        Common.print(arr);

    }

    public static void halfSearchInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int left = 0;
            int right = i - 1;
            int temp = arr[i];
            // 采用折半查找法判断插入位置，最终变量 left 表示插入位置
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] > temp) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // 有序表中插入位置后的元素统一后移
            for (int j = i; j > left; j--) {
                arr[j] = arr[j - 1];
            }
            // 插入元素
            arr[left] = temp;
        }
    }

}
