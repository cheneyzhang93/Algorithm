package sort;

public class Select {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 5, 6, 8, 9, 1, 7, 4};
        Select.selectSort(arr);
        Common.print(arr);

    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 当前比较的下标
            int index = i;
            // 找出最小的值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
