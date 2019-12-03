package sort;

public class Quick {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 6, 8, 9, 1, 7, 4};
        Quick.quickSort(arr, 0, arr.length - 1);
        Common.print(arr);

    }

    public static void quickSort(int[] arr, int left, int right) {

        if (left < right) {
            // 设置基准点
            int pivotIndex = partition(arr, left, right);
            // 分->left
            quickSort(arr, left, pivotIndex - 1);
            // 分->right
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        // 设置一个基准点
        int pivot = arr[left];
        int i = left, j = right;
        while (i < j) {
            // 将小于基准点的值移动到基准点的左边
            while (arr[j] >= pivot && i < j) {
                j--;
            }
            arr[i] = arr[j];
            // 将大于基准点的值移动到基准点的右边
            if (arr[i] <= pivot && i < j) {
                i++;
            }
            arr[j] = arr[i];
        }
        // 还原基准点
        arr[i] = pivot;
        return i;
    }

}
